package oracle.se.part1.array;

import java.util.Arrays;
import java.util.List;

public class ArraySearch {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] arrayDuplicate = {"a", "a", "c", "d", "e", "f", "g", "h"};
        String[] partialArray = {"a", "b", "c", "d"};
        String[] arrayUnsorted = {"b", "a", "e", "h", "c", "g", "f", "d"};

        List<String> firstList = List.of(array);
        List<String> secondList = Arrays.asList(arrayUnsorted);

        System.out.println("Search: " + Arrays.binarySearch(array, "d"));
        System.out.println("False Search: " + Arrays.binarySearch(array, "z"));
        System.out.println("Search unsorted: " + Arrays.binarySearch(arrayUnsorted, "b")); // указываеться не верный результат
        // что говорит о том что при поиске , обязательно нужно отсортировать свой массив
        System.out.println("Search duplicate: " + Arrays.binarySearch(arrayDuplicate, "a")); // берет последний индекс вхождения
        //элемента в массив

        System.out.println("MisMash");
        System.out.println(Arrays.mismatch(array, new String[] {"a, b, z"}));
    }
}
