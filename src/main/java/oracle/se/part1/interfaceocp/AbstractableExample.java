package oracle.se.part1.interfaceocp;

interface Abstractable {
    void makeConcrete();
}

abstract class AbstractClass implements Abstractable {
    abstract void  callConcrete();
}

public class AbstractableExample extends AbstractClass{
    @Override
    public void makeConcrete() {
        System.out.println("makeConcrete from AbstractableExample");
    }

    @Override
    void callConcrete() {
        System.out.println("callConcrete from AbstractableExample");
        makeConcrete();
    }


    public static void main(String[] args) {
        AbstractableExample ae = new AbstractableExample();
        ae.callConcrete();

    }
}
