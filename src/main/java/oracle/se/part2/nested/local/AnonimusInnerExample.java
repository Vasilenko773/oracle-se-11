package oracle.se.part2.nested.local;

abstract class AnAbstractClass {
    int i;
    abstract void doSomething();
}

interface Doable {
    void doSomething();
}

abstract class ConcreteClass extends AnAbstractClass {
    ConcreteClass(int i) {
        this.i = i;
    }
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
        Object obj = new Object(){
            public String toString() {
                return "anonymous object";
            }
        };

        new Doable(){
            @Override
            public void doSomething() {
                System.out.println("abstract method interface " + obj);
            }
        }.doSomething();

        AnAbstractClass c = new ConcreteClass(5) {
            {
                i = 2 * this.i;
            }
            @Override
            void doSomething() {
                System.out.println(this.i);
            }
        };
        System.out.println("__________");
        c.doSomething();
    }

}











