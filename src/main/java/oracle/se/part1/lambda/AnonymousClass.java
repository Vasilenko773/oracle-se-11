package oracle.se.part1.lambda;

public class AnonymousClass {

    interface Helloable {
        void hello();
    }

    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClass();

        class LocalClass extends Object {
            public void hello() {
                System.out.println("hello local class");
            }
        }

        new LocalClass().hello();
        Object anonymClass = new Object() {
            public String toString() {
                return "Hello anonymous class";
            }
        };

        System.out.println(anonymClass.toString());

        Helloable anonymInterface = new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello anonymous class implements " +
                        "interface");
            }
        };
        anonymInterface.hello();

        //ПЕРЕДАЧА АНОНИМНОГО КЛАССА В ПАРАМЕТЫР МЕТОДВ
        a.printHello(new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello anonymous class implements " +
                        "interface");
            }
        });

        //ИСПОЛЬЗОВАНИЕ ДЯМБДА ВЫРАЖЕНИЯ
        a.printHello(() -> System.out.println("Hello lambda"));

    }

    public void printHello(Helloable h) {
        h.hello();
    }
}
