package oracle.se.part2.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student {

    private String name;
}

public class MapStreamExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(new Student("Huan"), new Student("Migel")));
        List<Student> first = students.stream().limit(1).collect(Collectors.toList());
        List<Student> second = students.stream().map(MapStreamExample::name).collect(Collectors.toList());
        System.out.println("first");
        first.forEach(System.out::println);
        System.out.println("second");
        second.forEach(System.out::println);
        System.out.println(first.equals(second));


    }

public static Student name(Student s) {
        s.setName(s.getName() + " ohohoh");
        return s;
}

}


