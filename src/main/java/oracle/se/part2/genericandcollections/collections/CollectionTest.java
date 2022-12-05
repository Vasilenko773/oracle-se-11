package oracle.se.part2.genericandcollections.collections;

import java.util.Collection;
import java.util.List;

public class CollectionTest {

    public static <T> void doStuffWithCollection(Collection<T> h, T addedValue1, T addedValue2, T removedValue) {
        System.out.println("Start of method " + h);
        try {
            System.out.println("After adding null " + h.add(null) + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception adding null: " + e);
        }

        System.out.println("After adding " + addedValue1 + " " + h.add(addedValue1) + " " + h);
        System.out.println("After adding " + addedValue2 + " " + h.add(addedValue2) + " " + h);
        System.out.println("After removing " + removedValue + " " + h.remove(removedValue) + " " + h);
        try {
            System.out.println("After removing null " + h.remove(null) + " : " + h) ;
        } catch (Exception e) {
            System.out.println("Exception removed null " + e);
        }

        if (addedValue1 instanceof String) {
            performBulkFunctionsString((Collection<String>) h);
        } else if (addedValue1 instanceof Integer) {
            performBulkFunctions((Collection<Integer>) h);
        }
    }

    private static void performBulkFunctions(Collection<Integer> h) {

        System.out.println("add all 5, 10, 15, 20, 25, 25 " + h.addAll(List.of(5, 10, 15, 20, 25, 25)) + " : " + h);
        System.out.println("contains all 10, 20, 90, 100 " + h.containsAll(List.of(10, 20, 90, 100)) + " : " + h);
        System.out.println("contains all 5, 10, 15, 20, 25 " + h.containsAll(List.of(5, 10, 15, 20, 25)) + " : " + h);
        System.out.println("removeAll 10,30 " + h.removeAll(List.of(10,30)) + " : " + h);
        System.out.println("retainAll 10, 20, 30, 40, 50, 90 " + h.retainAll(List.of(10, 20, 30, 40, 50, 90)) + " : " + h);
    }

    private static void performBulkFunctionsString(Collection<String> h) {
        System.out.println("add all George, Harry, Isabel " + h.addAll(List.of("George", "Harry", "Isabel")) + " : " + h);
        System.out.println("containsAll Freed, Harry, Isabel" + h.containsAll(List.of("Freed", "Harry", "Isabel")) + " : " + h);
        System.out.println("containsAll Anne, Harry, Isabel" + h.containsAll(List.of("Anne", "Harry", "Isabel")) + " : " + h);
        try {
            System.out.println("After removed");
            System.out.println("removeAll Harry, Isabel" + h.removeAll(List.of("Harry", "Isabel")) + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception removing containsAll " + e);
        }

    }
}
