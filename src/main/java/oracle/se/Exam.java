package oracle.se;

import java.util.Arrays;


public class Exam {


    public static void main(String[] args) {
//        String rls = reverse("GrafaNA");
//        System.out.println(rls);

        int[] array = {1, 4, 6, 3, 2, 10, 9, 15, 78, 0};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    /*Cуть сортировки заключается в вычисленни минимального значения и помещения его впервый индекс., который в последствии увиличивается на 1*/
    private static void selectSort(int[] array) {
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

    private static void sortBubble(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int i1 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = i1;
                }
            }
        }
    }

    private static String reverse(String s) {
        StringBuilder rsl = new StringBuilder();
        String[] split = s.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            rsl.append(split[i]);
        }
        return rsl.toString();
    }
}

























