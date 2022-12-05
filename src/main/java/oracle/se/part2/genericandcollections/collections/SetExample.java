package oracle.se.part2.genericandcollections.collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        List<Integer> initialData = List.of(10, 20, 50, 40, 30);

        Set<Integer> h = new HashSet<>(initialData);
        System.out.println("HashSet");
        System.out.println("Original value entered " + initialData);
        CollectionTest.doStuffWithCollection(h, 60, 50, 10);
        System.out.println();
        Set<Integer> t = new TreeSet<>(initialData);
        System.out.println("TreeSet");
        System.out.println("Original value entered " + initialData);
        CollectionTest.doStuffWithCollection(t, 60, 50, 10);
        System.out.println();
        Set<Integer> i = new LinkedHashSet<>(initialData);
        System.out.println("LinkedHashSet");
        System.out.println("Original value entered " + initialData);
        CollectionTest.doStuffWithCollection(i, 60, 50, 10);
        System.out.println();
        System.out.println(h.equals(t));
        System.out.println(t.equals(i));
        System.out.println(i.equals(h));
    }
}
