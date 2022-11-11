package oracle.se.part1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExtras {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4));
        int size = 5;
        /* Если размер массива будет меньше размера коллекции , то массив не заполниться элементами коллекции
        * Если размер будет больше размера коллекции, массив заполниться данными, а остальные заполняться null
        * */
        Integer[] array = new Integer[size];
        integers.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
