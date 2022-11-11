package oracle.se.part1.primitivedata;

public class Foo2 {

    public static void main(String[] args) {
        /*Двоична запись байтов. 0b - означает что это двоичное число */
        byte b = 0b11111;
        System.out.println("byte: " + b);

        /*Восьмеричная запись. 0 - являеться восьмеричным префиксом*/
        short s = 0127;
        System.out.println("short: " + s);

        /*Шестнадцатиричная запись данных. x - префикс для 16тиричного числа */
        int i = 0x007F;
        System.out.println("int :" + i);

        /* Исаользование литератов для любого числового значения*/
        byte b1 = 'z';
        int i1 = 'a';
        double d = 'a';
        System.out.println(b1 + " " + i1 + " " + d);

        /* использование символом UTF-16 (ЮНИКОДА)*/
        byte b2 = '\u007F';
        char c = '\u007F';
        System.out.println("UTF-16");
        System.out.println("byte: " + b2);
        System.out.println("char: " + c);

    }
}
