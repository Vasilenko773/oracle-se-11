package oracle.se.part2.nested.local;

abstract class AbstractClass {
    public abstract void doSomething();
}

interface Executable {
    void doSomething();
}

public class LocalClassExampleTwo {
    String name = "Doe";

    public static void main(String[] args) {
        String name = "Smith";

        class A extends AbstractClass {

            @Override
            public void doSomething() {
                System.out.println("name = " + name);
            }
        }

        class B implements Executable {
            @Override
            public void doSomething() {
                System.out.println("name = " + name);
            }
        }

        abstract class C extends AbstractClass {
        }

        class D extends C {

            @Override
            public void doSomething() {
                System.out.println("name = " + name);
            }
        }

        new A().doSomething();
        new B().doSomething();
        new D().doSomething();
    }
}


















