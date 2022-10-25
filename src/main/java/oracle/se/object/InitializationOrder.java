package oracle.se.object;

public class InitializationOrder {

    public static void main(String[] args) {
        OrderClass o = new OrderClass();
    }

    static class OrderClass {

        static int statementOrder;

        int a = claryfy("assing a");

        {
            claryfy("initializer 1");
        }

        {
            claryfy("initializer 2");
        }

        OrderClass() {
            claryfy("constructor");
        }


        int c = claryfy("assing c");

        {
            claryfy("initializer 3" + " "  +this.a);
        }

        static {
            claryfy("static initializer 1");
        }

        public static int claryfy(String message) {
            statementOrder++;
            System.out.println(statementOrder + " " + message);
            return statementOrder;
        }

    }
}
