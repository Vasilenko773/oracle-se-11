package oracle.se.part2.genericandcollections.comporator;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class ComparingExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person("George", "Ball"), new Person("Bob", "Marley"),
                new Person("Ray", "Charles"), new Person("Bob", "Dillan"), new Person("Demian", "Marley")));
        people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
        people.forEach(System.out::println);
    }
}
