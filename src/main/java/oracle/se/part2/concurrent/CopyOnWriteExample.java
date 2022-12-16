package oracle.se.part2.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class CopyOnWriteExample {

    public static void testList(List<String> currentList) {
        System.out.println("--------- Testing " +
                currentList.getClass().toGenericString());
        System.out.println("Original State: " + currentList);
        Iterator<String> it = currentList.iterator();
        int i = 0;

        while (it.hasNext()) {
            System.out.println(it.next());
            if (i++ == 0) {
//                currentList.addAll(List.of("Bob", "Ray", "Joe"));
                it.remove();
       //         currentList.remove(0);
            } else if (i == 3) {
                break;
            }
            System.out.println("Printing remaining elements");
            it.forEachRemaining(System.out::println);
            System.out.println("Values = " + currentList + "\n");
        }
    }

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>(List.of("" + "David", "Bob", "Anne", "Carrol", "Evan"));
        List<String> cuncurrentList = new CopyOnWriteArrayList<>(aList);
        testList(aList);
    }
}
