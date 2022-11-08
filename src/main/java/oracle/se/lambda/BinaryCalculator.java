package oracle.se.lambda;

import java.util.function.IntBinaryOperator;

public class BinaryCalculator {

    interface BinaryOperation{
        int calculate(int i, int j);
    }

    public int calculate(int i, int j, IntBinaryOperator bo) {
        return bo.applyAsInt(i, j);
    }

    public static void main(String[] args) {
        BinaryCalculator calculator = new BinaryCalculator();
        IntBinaryOperator sum = Integer::sum;
        IntBinaryOperator substraction = (a, b) -> a - b;
        IntBinaryOperator multiplay = (var a,var b) -> a * b;
        IntBinaryOperator division = (a, b) -> a / b;
        System.out.println(calculator.calculate(1, 2, sum));
        System.out.println(calculator.calculate(3, 1, substraction));
        System.out.println(calculator.calculate(9, 3, multiplay));
        System.out.println(calculator.calculate(16, 4, division));
    }
}
