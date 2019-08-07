import java.util.Scanner;

public class Person {
    private String firstName;
    private int age;

    public Person() {
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return firstName.equals(person.firstName);
    }

    public boolean isUnique(Person[] array, Person temp){
        for (Person p : array){
            if(temp.equals(p)){
                return true;
            }
        }
        return false;
    }

    public static Person addPerson(Scanner in){
        System.out.println("Podaj imię i wiek: ");
        String firstName = in.nextLine();
        int age = in.nextInt();
        in.nextLine();
        return new Person(firstName, age);
    }

}
