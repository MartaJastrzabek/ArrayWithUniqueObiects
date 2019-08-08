import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person[] people = new Person[3];
        int count = 0;

        while (count < people.length){
            Person temp = addPerson(in);
            if(!isUnique(people, temp)){
                people[count] = temp;
                count++;
            }
        }

        System.out.println(Arrays.toString(people));

        in.close();
    }

    private static boolean isUnique(Person[] array, Person temp){
        for (Person p : array){
            if(temp.equals(p)){
                return true;
            }
        }
        return false;
    }

    private static Person addPerson(Scanner in){
        System.out.println("Podaj imię i wiek: ");
        String firstName = in.nextLine();
        int age = in.nextInt();
        in.nextLine();
        return new Person(firstName, age);
    }
}
