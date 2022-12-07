package oracle.se.part2.genericandcollections.comporator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class LastNameComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null || o2 == null) return -1;

        return o1.length() - o2.length();
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

        List<String> nameList = new ArrayList<>(List.of(names));
        System.out.println("-----Sorted initial List------");
        nameList.forEach(System.out::println);

        nameList.sort(Comparator.reverseOrder());
        System.out.println("-----Sorted initial List ReverseOrder------");
        nameList.forEach(System.out::println);

        nameList.sort(Comparator.naturalOrder());
        System.out.println("-----Sorted initial List NaturalOrder------");
        nameList.forEach(System.out::println);

        nameList.sort(new LastNameComparator());
        System.out.println("-----Sorted initialList LastNameComparator------");
        nameList.forEach(System.out::println);

        Arrays.sort(names, new LastNameComparator());
        System.out.println("-----Sorted arrays LastNameComparator------");
        Arrays.stream(names).forEach(System.out::println);

        nameList.sort(new LastNameComparator().reversed());
        System.out.println("-----Sorted initialList LastNameComparator Reversed------");
        nameList.forEach(System.out::println);

        nameList.add(null);
        nameList.sort(new LastNameComparator());
        System.out.println("-----Sorted initialList LastNameComparator contained Null element------");
        nameList.forEach(System.out::println);

        nameList.sort(Comparator.nullsFirst(new LastNameComparator()));
        System.out.println("-----Sorted initialList LastNameComparator contained NullFirst------");
        nameList.forEach(System.out::println);

        nameList.sort(Comparator.nullsLast(new LastNameComparator()));
        System.out.println("-----Sorted initialList LastNameComparator contained NullLast------");
        nameList.forEach(System.out::println);
    }
}

