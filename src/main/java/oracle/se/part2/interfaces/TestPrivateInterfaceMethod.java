package oracle.se.part2.interfaces;

class TestStatic {
    public static void doClassPublicAndStatic() {
        System.out.println("static method in TestStatic");
    }
}

interface PrivateAndDefaultTestable {

    default void doInterfaceSomethingPublic() {
        System.out.println("doInterfaceSomethingPublic in PrivateAndDefaultTestable");
        doInterfaceSomethingPrivate();
        doInterfaceSomethingPrivateStatic();
        doInterfaceSomethingAndStatic();
    }

    default void a() {
        doInterfaceSomethingPublic();
    }

    private void doInterfaceSomethingPrivate() {
        System.out.println("private method in PrivateAndDefaultTestable");
    }

    static void doInterfaceSomethingAndStatic() {
        System.out.println("static method in interface");
        doInterfaceSomethingPrivateStatic();

    }

    private static void doInterfaceSomethingPrivateStatic() {
        System.out.println("private  static method in interface");
    }
}

public class TestPrivateInterfaceMethod extends TestStatic implements PrivateAndDefaultTestable {

    public static void main(String[] args) {
        doClassPublicAndStatic();
        TestStatic.doClassPublicAndStatic();
        PrivateAndDefaultTestable.doInterfaceSomethingAndStatic();
        new TestPrivateInterfaceMethod().testNoStatic();
    }

    void testNoStatic() {
        a();

    }
}
