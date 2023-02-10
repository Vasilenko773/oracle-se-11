package interview.patern.builder;

public class StudentConcreteBuilder implements StudentBuilder{

    private String name;
    private String cours;
    private String group;

    @Override
    public StudentBuilder namemed() {
        this.name = "First Student";
        return this;
    }

    @Override
    public StudentBuilder cours() {
        this.cours = "Programming";
        return this;
    }

    @Override
    public StudentBuilder group() {
        this.group = "819-1zo";
        return this;
    }

    @Override
    public Student student() {
        return new Student(name, cours, group);
    }
}
