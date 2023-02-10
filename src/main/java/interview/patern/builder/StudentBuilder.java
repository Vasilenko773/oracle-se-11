package interview.patern.builder;

public interface StudentBuilder {

    StudentBuilder namemed();
    StudentBuilder cours();
    StudentBuilder group();
    Student student();
}
