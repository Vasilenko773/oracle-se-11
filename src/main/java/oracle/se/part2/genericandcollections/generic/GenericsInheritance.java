package oracle.se.part2.genericandcollections.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

    public static void methodeOne(Number number) {
        System.out.println(number.getClass().getName());
    }

    public static void methodeTwo(ArrayList<? extends Number> numbers) {
        System.out.println(numbers.getClass().getName());
    }

    public static void methodeThree(List<Integer> integers) {
        System.out.println(integers.getClass().getName());
    }

    public static void main(String[] args) {
        Integer i = 1;
        Number n = i;
        Integer i2 = (Integer) n;
        methodeOne(i);

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<? extends Number> numbers = integers;
        ArrayList<Integer> integers1 = (ArrayList<Integer>)numbers;
        methodeTwo(integers);

        List<Integer> integerList = integers;
        ArrayList<Integer> integers2 = (ArrayList<Integer>)integerList;
        methodeThree(integers2);
    }
}
