package oracle.se.part1.primitivedata.strings;

public class StringConcat {

    public static void main(String[] args) {
        String hello = "HELLO";
        String world = "WORLD";
        String first = hello + " " + world;
        System.out.println(first);

        Object nullObject = null;
        String second = null + " " + hello;
        System.out.println(second);
        /* Результат: null HELLO*/

        int i = 10;
        String third = i + " " + world;
        System.out.println(third);
        /* 10 WORLD /*/

        OutSimpleClass out = new OutSimpleClass();
        String four = out + " " + hello;
        System.out.println(four);

        int j = 10;
        String five = i + j + " = " + i + j;
        System.out.println(five);
        /* 20 = 1010
        * Связано с тем что изначально + расценивался как оператор сложения,
        *  после чего он презагрузился оператором конкотенации
        * */

        String six = i + j + " = " + (i + j);
        System.out.println(six);
          /* 20 = 20*/

        String seven = "" + i + j + " = " + i + j;
        System.out.println(seven);


    }
}

class OutSimpleClass {

    @Override
    public String toString() {
        return "OutSimpleClass toString";
    }
}
