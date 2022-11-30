package oracle.se.part2.genericandcollections;

public class MoreWrapperMethods {

    public static void main(String[] args) {
   //     testInstanceMethods();
        testStaticMethod();
    }

    private static void testInstanceMethods() {
        Boolean b = true;
        Character c = 'c';
        Integer i = 100;
        Short s = 100;
        System.out.println( " Boolean " + b.booleanValue());
        System.out.println( " Character " + c.charValue());
        System.out.println( " Integer " + i.intValue());
        System.out.println(" Short  " + s.shortValue());
        Boolean b2 = true;
        System.out.println(printWrapper(b)  + " " + b.equals(null));
        System.out.println(printWrapper(b)  + " " + b.equals(false));
        System.out.println(printWrapper(b)  + " " + b.equals(true));
        System.out.println(printWrapper(b)  + " " + b.equals(b2));
        System.out.println("____________");
        Integer i2 = 100;
        System.out.println(printWrapper(i)  + " " + i.equals(null));
        System.out.println(printWrapper(i)  + " " + i.equals(i2));
        System.out.println(printWrapper(i)  + " " + i.equals(s));
        System.out.println(printWrapper(i)  + " " + i.equals((Number)s));
        System.out.println("____________");
    }

    public static String printWrapper(Object o) {
        return "[" + o.getClass().getSimpleName() + "(" + o +")]";
    }

    private static void testStaticMethod() {
        System.out.println(Boolean.compare(true, true));
        System.out.println(Boolean.compare(false, false));
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(false, true));

        System.out.println("__________");
        System.out.println(Integer.compare(2, 0b10));
        System.out.println(Integer.compare(10, 0));
        System.out.println(Integer.compare(0, 10));
        System.out.println(Integer.compare('A', 'a'));

        System.out.println(Integer.parseInt("100"));
        System.out.println(Boolean.parseBoolean("TRUE"));

        System.setProperty("value", "10");
        Integer.getInteger("value");
        System.out.println(Boolean.getBoolean("true"));


    }
}
