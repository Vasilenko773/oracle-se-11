package oracle.se.part2.genericandcollections.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        List<Integer> initData = List.of(10, 20, 50, 40, 30);
        System.out.println("----------ArrayDeque-----------");
        System.out.println("Original values entered: " + initData);
        Queue<Integer> arrayDeque = new ArrayDeque<>(initData);
        CollectionTest.doStuffWithCollection(arrayDeque, 60, 20, 50);
        System.out.println("----------LinkedList-----------");
        System.out.println("Original values entered: " + initData);
        Queue<Integer> linkedList = new LinkedList<>(initData);
        CollectionTest.doStuffWithCollection(linkedList, 60, 20, 50);
    }
}
