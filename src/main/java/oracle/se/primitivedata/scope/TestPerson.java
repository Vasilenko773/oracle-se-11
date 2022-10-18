package oracle.se.primitivedata.scope;

public class TestPerson {

    public static void main(String[] args) {
        Person bob = new Person("Bob", "15");
        Person carl = new Person("Carl", "65");
        Person person = new Person();
        System.out.println(carl);
        System.out.println(bob);
        System.out.println(person);
        Person joh = new Person("Joh", "8");
        System.out.println(joh);
    }
}
