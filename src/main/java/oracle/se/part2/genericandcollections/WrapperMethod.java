package oracle.se.part2.genericandcollections;

public class WrapperMethod {
    public static void main(String[] args) {
        Boolean bWrapper = true;
        Character cWrapper = 'a';
        Short sWrapper = 10;
        Integer iWrapper = 0b00100001;
        Integer iWrapper2 = 0xABC;
        Double dWrapper = 20.0d;
        Float fWrapper = 2.0e2f;
        Character cWrapper2 = '\u0041';

        printWrappers("Float Value of", Float.valueOf(10), Float.valueOf('a'),
                Float.valueOf(12.5f), Float.valueOf("100.0"), Float.valueOf("15.0F"), Float.valueOf("250.0D"));

        printWrappers("Boolean Value of", Boolean.valueOf("FALSE"), Boolean.valueOf(null));
        testException();


    }

    public static void printWrappers(String title, Object... wrappers) {
        System.out.println("-------------- " + title);
        for (Object o : wrappers) {
            System.out.println(o.getClass().getSimpleName() + " : " + o);
        }
    }

    public static void testException() {

        class WrapIt {
            String type;
            String value;

            WrapIt(String type, String value) {
                this.type = type;
                this.value = value;
            }


            public Object getWrapper() {
                switch (type) {
                    case "Float":
                        return Float.valueOf(value);
                    case "Integer":
                        return Integer.valueOf(value);
                }
                return null;
            }

            public String toString() {
                return type + ".valueOf(" + value + ")";
            }
        }

        WrapIt[] test = {
                new WrapIt("Float", null),
                new WrapIt("Integer", "10.0"),
                new WrapIt("Integer", "10.f"),
                new WrapIt("Integer", "100_000"),
                new WrapIt("Integer", "0b00100001"),
                new WrapIt("Integer", "0xABC"),
        };

        for (WrapIt w : test) {
            try {
                w.getWrapper();
                System.out.println(w + " worked");
            } catch (Exception e) {
                System.out.println(w + " " + e);
            }
        }
    }
}
