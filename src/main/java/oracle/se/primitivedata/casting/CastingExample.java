package oracle.se.primitivedata.casting;

public class CastingExample {

    public static void main(String[] args) {
        /*Кастинг в сторону расширения */
        int first = Short.MIN_VALUE - 1;
        int second = Short.MAX_VALUE + 1;

        for (int i = first; i <= second; i++) {
            short s = (short) i;
            System.out.println(s);
        }

       /* int i = Integer.MIN_VALUE;
        short s = (short) i;
        System.out.println(s);*/
        /*Происходит утечка данных*/
    }
}
