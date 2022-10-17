package oracle.se.primitivedata.wideningnarrowwing;

public class NarrowExample {

    public static void main(String[] args) {
        System.out.println("byte " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        /*Если значения привышают максимальные значения переменных то возникнет ошибка компилсятора*/

       /* byte b = 0.0;
        short s = 0.0;
        int i = 0.0;
        float f = 0.0;
        char c = 0.0;
        */
        double d = 0.0;
        /*Все типы данных кроме double нельзя объеявить с применением двойного 0 (float можно только так - 0.0f)
        Так как нельзя явно сузить double(0.0 - иннициализация double)
        * */

        int I = 1;
        /*byte b = I;
        short s = I;
        char c = I;*/
        /* Во всех трех случаях возникнет ошибка компиляции, потому что JVM не знает, что мы указали единицу.*/
    }


}
