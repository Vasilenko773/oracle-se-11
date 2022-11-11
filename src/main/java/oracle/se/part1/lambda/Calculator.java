package oracle.se.part1.lambda;

public class Calculator {

    interface UnaryIntegerOperation {
        int calculate(int a);
    }

    public int calculate(int a, UnaryIntegerOperation op) {
        return op.calculate(a);
    }

    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        UnaryIntegerOperation square = (int a) -> a * a;
        UnaryIntegerOperation cube = a -> a * a * a;
        UnaryIntegerOperation increment = (a) -> a + 1;
        UnaryIntegerOperation decrement = a -> {
            return a - 1;
        };

        int value = 2;
        System.out.println(myApp.calculate(value, square));
        System.out.println(myApp.calculate(value, cube));
        System.out.println(myApp.calculate(value, increment));
        System.out.println(myApp.calculate(value, decrement));

    }
}
