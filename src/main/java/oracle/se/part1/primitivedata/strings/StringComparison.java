package oracle.se.part1.primitivedata.strings;

public class StringComparison {

    public static void main(String[] args) {

        String nullString = null;
        String hello = "Hello";
        String hello1 = "hello";
        String hello2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println(hello.equals(hello2));
        /* Сравнивать с null можно только если null будет справа иначе возникнет исключение NullPointerException*/
//       nullString.equals(hello2);
    }
}
