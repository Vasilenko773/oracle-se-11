package oracle.se.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /* Пример одновременной инциализации двух массивов*/
        int[] first, second = first = new int[]{1, 2, 3};

        Integer[] intFirst = new Integer[5];
        int[] intSecond = new int[5];
        System.out.println("toString");
        System.out.println(Arrays.toString(intFirst)); // инициализируеться null
        System.out.println(Arrays.toString(intSecond)); // инициализируеться 0

        System.out.println("for");
        for (int i = 0; i < intSecond.length; i++) {
            intFirst[i] = intSecond[i] = (i + 1);
        }
        System.out.println(Arrays.toString(intFirst));
        System.out.println(Arrays.toString(intSecond));

        System.out.println("Присвоение данных");
        Integer[] newint1 = intFirst;
        int[] newint2 = intSecond;
        newint1[0] = 99;
        newint2[1] = 55;
        System.out.println(Arrays.toString(intFirst));
        System.out.println(Arrays.toString(intSecond));
        System.out.println(Arrays.toString(newint1));
        System.out.println(Arrays.toString(newint2));
    }
}
