package oracle.se.part2.interfaces;

class SuperClass {
    public void doSomething() {
        System.out.println("SuperClass: doSomething");
    }
}

interface LessSpecificInterface {
    default void doSomething() {
        System.out.println("LessSpecific: doSomething");
    }
}

interface MoreSpecificInterface {
    default void doSomething() {
        System.out.println("MoreSpecific: doSomething");
    }
}

public class MethodSelection implements MoreSpecificInterface, LessSpecificInterface {
    public static void main(String[] args) {
        MethodSelection methodSelection = new MethodSelection();
        methodSelection.callDoSomething();
    }

    public void callDoSomething() {
        doSomething();
    }

   public void doSomething() {
        System.out.println("MoreSpecific: doSomething");
    }
}
