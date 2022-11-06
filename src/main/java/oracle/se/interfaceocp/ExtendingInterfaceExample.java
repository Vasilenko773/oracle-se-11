package oracle.se.interfaceocp;

interface Extendable {
    default void defaultMethod() {
        System.out.println("Extendable : default method");
    }

    void extend();
}

interface SubExtendable extends Extendable {
    void append();
}

public class ExtendingInterfaceExample implements SubExtendable {


    @Override
    public void extend() {
        defaultMethod();
        append();
    }

    @Override
    public void append() {
        System.out.println("append method from ExtendingInterfaceExample");
    }

    public static void main(String[] args) {
        ExtendingInterfaceExample eie = new ExtendingInterfaceExample();
        eie.extend();
    }
}
