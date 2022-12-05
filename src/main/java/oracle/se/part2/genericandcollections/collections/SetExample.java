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
        System.out.println();
        System.out.println("Added null");
        h.add(null);
        System.out.println(h.equals(i));
        System.out.println();
        TreeSet<Integer> treeSet = (TreeSet<Integer>) t;
        System.out.println(treeSet);
        System.out.println(treeSet.lower(1) + " : " + treeSet.lower(10) + " : " + treeSet.lower(20) + " : " + treeSet.lower(50) + " : " + treeSet.lower(51) + " : ");
        System.out.println(treeSet.floor(1) + " : " + treeSet.floor(10) + " : " + treeSet.floor(20) + " : " + treeSet.floor(50) + " : " + treeSet.floor(51) + " : ");
        System.out.println(treeSet.ceiling(1) + " : " + treeSet.ceiling(10) + " : " + treeSet.ceiling(20) + " : " + treeSet.ceiling(50) + " : " + treeSet.ceiling(51) + " : ");
        System.out.println(treeSet.higher(1) + " : " + treeSet.higher(10) + " : " + treeSet.higher(20) + " : " + treeSet.higher(50) + " : " + treeSet.higher(51) + " : ");

    }
}
