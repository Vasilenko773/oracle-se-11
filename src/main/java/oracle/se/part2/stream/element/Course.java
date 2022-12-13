package oracle.se.part2.stream.element;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@NoArgsConstructor
@Data
public class Course {

    private String name;
    private List<Student> students;

    public Course(String name, int studentsCount) {
        this.name = name;
        this.students = Stream.generate(Student::new).limit(studentsCount)
                .map(s -> new Student((s.getName() + " " + name)))
                .collect(Collectors.toList());
    }
}
