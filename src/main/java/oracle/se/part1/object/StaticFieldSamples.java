package oracle.se.part1.object;

public class StaticFieldSamples {

    public static void main(String[] args) {
        SuperClass a, b, c;
        System.out.println(a = new SuperClass("A", "One"));
        System.out.println(b = new SuperClass("B", "TWO"));
        System.out.println(c = new SuperClass("C", "Three"));

        System.out.println("___________");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("_________");
        FinalClass f, e;
        System.out.println(f = new FinalClass());
    }

    public static final class FinalClass {
        final String four;

        {
            four = "FOUR";
        }

        final String five;

        FinalClass() {
            five = "constructor five";
        }

        FinalClass(String v) {
            five = "constructor five" + v;
        }

        @Override
        public String toString() {
            return "FinalClass{" +
                    "four='" + four + '\'' +
                    ", five='" + five + '\'' +
                    '}';
        }
    }

}

class SuperClass {
    static String name;
    String instanceName;
    final static String first = "FIRST";
    final static String second = "SECOND";
    final static String three;

    static {
        three = "THREE";
    }


    SuperClass(String name, String instanceName) {
        SuperClass.name = name;
        this.instanceName = instanceName;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "instanceName='" + instanceName + '\'' + " " + SuperClass.name + " " + SuperClass.first +
                " " + SuperClass.second + " " + SuperClass.three +
                '}';
    }
}




