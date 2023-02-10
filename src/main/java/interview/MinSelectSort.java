package interview;

import java.util.Arrays;

public class MinSelectSort {
    public static void main(String[] args) {
        int[] array = {1, 14, 12, 2, 0, 5, 9, 8, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = min; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                int i1 = array[i];
                array[i] = array[min];
                array[min] = i1;
            }
        }
    }
}
