package oracle.se.part2.interfaces.functionInterfaces;

interface Calculable {
    float calculate(float operand1, float operand2);
}

interface Showable {
    void showIt();
}

public class LambdaExample2 {

    private static float aFloat = 1f;
    private float bfloat = 2f;

    private static void executeFirstMethod() {
        System.out.println("First Method executing");
    }

    private static int executeSecondMethod() {
        System.out.println("Second Method executing");
        return 1;
    }


    public static void main(String[] args, Calculable calculable) {
        LambdaExample2 l = new LambdaExample2();
        Calculable c1 = (i, j) -> i + ++j;
        Calculable c2 = (float i, float j) -> i + j;
        Calculable c3 = (var i, var j) -> i + j;
        Calculable c4 = (i, j) -> aFloat + l.bfloat;
        System.out.println(c1.calculate(aFloat, l.bfloat++));
        c4 = (i, j) -> i / j;

    }
}
