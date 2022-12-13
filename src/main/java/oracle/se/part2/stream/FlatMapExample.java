package oracle.se.part2.stream;

import oracle.se.part2.stream.element.Course;
import oracle.se.part2.stream.element.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Student> collect = Stream.of(
                        new Course("Geometry 101", 3),
                        new Course("Java 101", 4),
                        new Course("History 101", 5))
                .peek(System.out::println)
                .flatMap(c -> c.getStudents().stream()).collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}
