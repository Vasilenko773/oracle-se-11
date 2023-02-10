package interview.algoritm;

import java.util.Scanner;

public class FinonachiAlgoritm {

    public static void main(String[] args) {
        fibonachi();
    }

    private static void fibonachi() {
        int i = 0, j = 0, z = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите колличество данных");
        int i1 = scanner.nextInt();
        for (int c = 0; c <= i1; c++) {
            i = j;
            j = z;
            z = i + j;
            System.out.println(z);
        }
    }
}

