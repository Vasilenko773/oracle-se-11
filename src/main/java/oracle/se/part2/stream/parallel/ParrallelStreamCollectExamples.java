package oracle.se.part2.stream.parallel;

import lombok.Getter;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
class Person {

    private static int id_counter;
    private static String[] names = {"Anne", "Bob", "Carol", "David", "Evan", "Fred", "George", "Harold", "Ida", "Jack", "Kevin"};
    private String name;
    private int id;
    private int age;

    Person() {
        Random random = new Random();
        this.name = names[new Random().nextInt(11)];
        this.id = ++id_counter;
        this.age = random.nextInt(99);
    }
}

public class ParrallelStreamCollectExamples {

    public static void main(String[] args) {
        Collector c1 = Collectors.toMap(String::length, s -> s);
        System.out.println(c1.characteristics());

        Collector c2 = Collectors.toConcurrentMap(String::length, s ->s);
        System.out.println(c2.characteristics());

        Collector c3 = Collectors.groupingBy(Person::getAge);
        System.out.println(c3.characteristics());

        Collector c4 = Collectors.groupingByConcurrent(String::toString, Collectors.toList());
        System.out.println(c4.characteristics());


        Set<Person> personSet = Stream.generate(Person::new).limit(5_000_000).collect(Collectors.toSet());
        testToMap(personSet);
    }

    static void testToMap(Set<Person> personSet) {
        long start = System.currentTimeMillis();

        Map<Integer, Person> personMap = personSet.stream().collect(Collectors.toMap(Person::getId, p -> p));
        System.out.println(System.currentTimeMillis() - start + " ms");

        start = System.currentTimeMillis();
        Map<Integer, Person> personMap1 = personSet.parallelStream().collect(Collectors.toMap(Person::getId, p -> p));
        System.out.println(System.currentTimeMillis() - start + " ms");

        start = System.currentTimeMillis();
        Map<Integer, Person> personMap2 = personSet.parallelStream().collect(Collectors.toConcurrentMap(Person::getId, p -> p));
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}
