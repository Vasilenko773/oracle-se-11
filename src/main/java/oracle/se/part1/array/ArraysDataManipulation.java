package oracle.se.part1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDataManipulation {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        System.out.println(Arrays.toString(array));
        Arrays.fill(array, 5);
        System.out.println(Arrays.toString(array));
        Arrays.setAll(array, i -> i + 3);
        System.out.println(Arrays.toString(array));
        Arrays.parallelPrefix(array, (i, j) ->i + j);
        System.out.println(Arrays.toString(array));
        List<String> rsl = new ArrayList<>(List.of("First", "Second"));
        // в Случае копирования в List of (Без arrayList)  бедет ошибка!
        rsl.set(0, "Third");
        System.out.println(rsl);
    }
}
