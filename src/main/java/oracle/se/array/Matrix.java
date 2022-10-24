package oracle.se.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][10];

        System.out.println(Arrays.deepToString(matrix));
        int[][] variable = {{1, 2},
                {1, 2, 3, 4},
                {3}};
        System.out.println(Arrays.deepToString(variable));

        int[][] clone = variable.clone();
        System.out.println(Arrays.deepToString(clone));

        int[][] copy = (int[][]) Arrays.copyOf(variable, variable.length);
        System.out.println(Arrays.deepToString(copy));
    }

}
