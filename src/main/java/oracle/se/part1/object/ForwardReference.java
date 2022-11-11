package oracle.se.part1.object;

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one.toString());
    }

    static class Thing {
        Thing() {
            secondString = "b" + thirdString;
        }

        {
            firstString = "a" + thirdString;
        }

        static {
            thirdString = "c";
        }

        String firstString;
        String secondString;
        static String thirdString;

        @Override
        public String toString() {
            return firstString + secondString + thirdString;
        }

    }
}
