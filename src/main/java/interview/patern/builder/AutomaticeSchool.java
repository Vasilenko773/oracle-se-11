package interview.patern.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AutomaticeSchool {

    private final StudentBuilder studentBuilder;

    public Student student() {
      return   studentBuilder.namemed().group().cours().student();
    }

    public static void main(String[] args) {
        StudentConcreteBuilder studentConcreteBuilder = new StudentConcreteBuilder();
        AutomaticeSchool automaticeSchool = new AutomaticeSchool(studentConcreteBuilder);
        Student student = automaticeSchool.student();
        System.out.println(student);
    }
}
