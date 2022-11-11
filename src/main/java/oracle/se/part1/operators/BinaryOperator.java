package oracle.se.part1.operators;

public class BinaryOperator {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        /*Сначало выполняються Мультипликативные операторы (*;/;%), потом адитивные(+; -;) */
        int rsl = a + e * b - f / c % b;
        System.out.println(rsl);
        System.out.println("________");
        System.out.println(11 % 10);

        for (int i = 0; i <= 9; i += 3) {
            for (int j = 10; j <= 100; j += 30) {
                System.out.println(i % j);
            }
        }
        System.out.println("_________");
        // System.out.println(10 % 0); // ArithmeticException - Деление на ноль
        System.out.println(10.0 % 0.0); // Nan - значение не число, информирует о недопустимости операции
        System.out.println(Integer.toBinaryString(0b00010001_00010 >> 1)); // сдвигает биты на 1 в право
    }

}
