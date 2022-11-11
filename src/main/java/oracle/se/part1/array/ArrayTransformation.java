package oracle.se.part1.array;

import java.util.Arrays;

public class ArrayTransformation {

    public static void main(String[] args) {
        Integer[] original = new Integer[10];

        Arrays.setAll(original, i -> i + 1); // необязательно передовать ссылку в новый массив, изменяеться существующий
        System.out.println(Arrays.toString(original));

        Integer[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy));

        Integer[] trimmedArray= Arrays.copyOf(original, 7);
        System.out.println(Arrays.toString(trimmedArray));

        Integer[] widenedArray= Arrays.copyOf(original, 14);
        System.out.println(Arrays.toString(widenedArray));
    }
}
