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

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + age;
        return result;
    }
}
