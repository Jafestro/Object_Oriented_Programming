package module8.module8_1.Task1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "New York"));
        people.add(new Person("Jane", 30, "Los Angeles"));
        people.add(new Person("Tom", 35, "Chicago"));
        people.add(new Person("Alice", 40, "Houston"));
        people.add(new Person("Bob", 45, "Phoenix"));

        Comparator<Person> compareByAge = (Person p1, Person p2) -> p1.getAge() - p2.getAge();

        people.sort(compareByAge);
        people.forEach(person -> System.out.println(person.getName() + " " + person.getAge() + " " + person.getCity()));

        people.removeIf(person -> person.getCity() != "New York");
        System.out.println("After removing people not from New York:");
        people.forEach(person -> System.out.println(person.getName() + " " + person.getAge() + " " + person.getCity()));
    }
}