package oracle.se.part2.genericandcollections.comporator;

import java.util.Arrays;
import java.util.Comparator;

class LastNameComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null || o2 == null) return -1;
        String[] names = o1.split("\\s");
        String[] names1 = o2.split("\\s");
        return names[names.length - 1].compareTo(names1[names1.length - 1]);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = {
                "Ralph",
                "Harry Bith",
                "Jon Snow",
                "Abraham",
                "Bart"
        };
        Arrays.stream(names).forEach(System.out::println);
        Arrays.sort(names); // сортирует в естественном порядке (алфавитном)
        Arrays.stream(names).forEach(System.out::println);
    }
}

