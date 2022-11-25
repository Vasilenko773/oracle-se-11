package oracle.se.part2.interfaces;

public interface Defaultable {

    String abstractValue = "ABSTRACT";

    void abstractMethod();

    default void defaultNotAbstractMethod() {
        System.out.println("Testing default");
    }

}

class ImplementingClass implements Defaultable {

    @Override
    public void abstractMethod() {
        System.out.println("ImplementingClass class implements method");
    }

    public void anotherAbstractMethod() {
        System.out.println("ImplementingClass class implements anotherAbstractMethod");
    }
}

class DefaultClass extends Base implements Defaultable{
    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.callAbstractMethod(new ImplementingClass());
        defaultClass.callAbstractMethod(() -> System.out.println("Lambda implements method"));
        defaultClass.defaultNotAbstractMethod();
    }

    public void callAbstractMethod(Defaultable defaultable) {
        defaultable.abstractMethod();
    }

    @Override
    public void abstractMethod() {
        defaultNotAbstractMethod();
    }
}

class Base {

   public void defaultNotAbstractMethod() {
        System.out.println("Test Base class");
    }
}
