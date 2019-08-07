import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person[] people = new Person[3];
        int count = 0;

        do{
            Person temp = Person.addPerson(in);
            if(!temp.isUnique(people, temp)){
                people[count] = temp;
                count++;
            }
        } while (people[2]==null);

        System.out.println(Arrays.toString(people));

        in.close();
    }
}
