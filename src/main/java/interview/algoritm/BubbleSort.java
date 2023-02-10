package interview.algoritm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 6, 5, 12, 4, 3, 17};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int i1 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = i1;
                }
            }
        }
    }
}
