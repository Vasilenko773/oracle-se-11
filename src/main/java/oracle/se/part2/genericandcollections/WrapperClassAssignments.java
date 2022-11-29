package oracle.se.part2.genericandcollections;

public class WrapperClassAssignments {

    static Boolean myStaticBoolean = true;
    static boolean myStaticboolean;
    static Integer integer;
    boolean myInstanceboolean = myStaticBoolean;

    public static void main(String[] args) {
        WrapperClassAssignments wr = new WrapperClassAssignments();
        Boolean bWrapperVariable = wr.myInstanceboolean;
        System.out.println(bWrapperVariable);
        Boolean bWrapperVariable2 = true;
        System.out.println(bWrapperVariable2);
        boolean primitiveVariable = wr.myInstanceboolean;
        System.out.println(primitiveVariable);
        testBoolean(true);
        testboolean(bWrapperVariable);
        testBoolean(myStaticboolean);
        System.out.println(integer);
    }

    private static void testBoolean(Boolean b) {
        System.out.println("Boolean Wrapper Value = " + b);
    }

    private static void testboolean(boolean b) {
        System.out.println("boolean Wrapper Value = " + b);
    }
}
