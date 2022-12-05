package oracle.se.part2.genericandcollections.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static void printUpperList(List<? extends Exception> list) {
        System.out.println("-------using upper bound-------");
        list.forEach(s -> System.out.println(s.getLocalizedMessage()));
    }

    public static void printLowerList(List<? super Exception> list) {
        System.out.println("-------using lower bound-------");
        list.forEach(System.out::println);
    }

    public static void printOpenDoor(List<?> list) {
        System.out.println("-------using no bound-------");
        list.forEach(System.out::println);
    }

    public static void printObjectList(List<Object> list) {
        System.out.println("-------using made up to object-------");
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<RuntimeException> runtimeExceptions = new ArrayList<>();
        ArrayList<Exception> exceptions = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            try {
                int j = i / 0;
            } catch (RuntimeException e) {
                runtimeExceptions.add(e);
                exceptions.add(e);
            }
        }
        printUpperList(runtimeExceptions);
        printOpenDoor(runtimeExceptions);

        printUpperList(exceptions);
        printLowerList(exceptions);
        printOpenDoor(exceptions);

        List<Integer> integerList = List.of(5, 10, 15);
        printOpenDoor(integerList);

        List<Object> objectList = List.of("a", "b", "c");
        printLowerList(objectList);
        printOpenDoor(objectList);
        printObjectList(objectList);

        printObjectList((List) integerList);
        List objectList1 = integerList;
        System.out.println("_______________");
        try {
            printUpperList(objectList1);
        } catch (Exception e ) {
            e.printStackTrace();;
        }
    }

}
