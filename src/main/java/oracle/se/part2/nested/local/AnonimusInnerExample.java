package oracle.se.part2.nested.local;

abstract class AnAbstractClass {
    int i;
    public abstract void doSomething();
}

interface Doable {
    void doSomething();
}

public class AnonimusInnerExample {
    String mame = "default";

    public void testAnonymous() {
        AnAbstractClass an = new AnAbstractClass() {
            @Override
            public void doSomething() {
                System.out.println("Anonymous class " + i);
            }
        };
        an.doSomething();
    }

    public static void main(String[] args) {
        new AnonimusInnerExample().testAnonymous();
    }

}











