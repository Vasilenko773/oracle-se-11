package oracle.se.colections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> firstArray = new ArrayList<>(List.of("ABC", "DEF", "GHI", "JKL", "MNO", "PRS"));
        ArrayList<String> secondArray = new ArrayList<>(List.of("ABC", "DEF", "GHI", "JKL", "MNO", "PRS"));
        ArrayList<String> thirdArray = new ArrayList<>();
        System.out.println(thirdArray.isEmpty());
        System.out.println(firstArray.equals(secondArray));
        System.out.println(firstArray.equals(thirdArray));

        System.out.println(firstArray.containsAll(List.of("ABC", "DEF")));
        System.out.println(secondArray.indexOf("GHI"));
    }
}
