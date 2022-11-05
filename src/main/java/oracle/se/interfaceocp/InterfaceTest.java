package oracle.se.interfaceocp;

interface InterfaceExample {

    String interfaceName = "interfaceExample";

    static String staticInterfaceName = "staticInterfaceExample";
    public String publicInterfaceName = "publicInterfaceExample";
    final String finalInterfaceName = "finalInterfaceExample";

    public static String publicStaticStringInterfaceName = "publicStaticInterfaceExample";
    static final String finalStaticStringInterfaceName = "finalStaticInterfaceExample";

    public static final String publicStaticFinalStringInterfaceName = "publicStaticFinalInterfaceExample";

   private String privateMethod() {
        return "private";
    }

    private static String privateStaticMethod() {
       return "private static";
    }

    default String defaultMethod() {
       return privateMethod() + " then default";
    }

    static String publicStaticMethod() {
       return InterfaceExample.privateStaticMethod() + " then static";
    }

    void thenImportantMethod();

}

public class InterfaceTest implements InterfaceExample{

    public static void main(String[] args) {
        System.out.println(InterfaceExample.interfaceName);
        System.out.println(InterfaceExample.staticInterfaceName);
        System.out.println(InterfaceExample.publicInterfaceName);
        System.out.println(InterfaceExample.finalInterfaceName);
        System.out.println(InterfaceExample.publicStaticStringInterfaceName);
        System.out.println(InterfaceExample.finalStaticStringInterfaceName);
        System.out.println(InterfaceExample.publicStaticFinalStringInterfaceName);
        System.out.println("____________");
        System.out.println(InterfaceExample.publicStaticMethod());

        InterfaceTest it = new InterfaceTest();
        System.out.println(it.defaultMethod());

    }

    @Override
    public void thenImportantMethod() {
        System.out.println("realization interface method");
    }

    public void thenImportantMethod(String t) {
        System.out.println("realization interface method" + t);
    }

    public void thenImportantMethod(InterfaceExample ie) {
        System.out.println("realization interface method");
        ie.defaultMethod();
    }
}
