package oracle.se.part2.concurrent;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequePeek {

    public static void main(String[] args) {
        List staticList = List.of("Jane", "Ralph", "Anne", "Mary", "Ralph", "Anne", "Harold", "Anne", "John", "Carol");
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(staticList);
        userGetMethods(blockingDeque);
    }


    private static  void  userGetMethods(BlockingDeque<String> blockingDeque) {
        System.out.println("__________ Poll Methods_____________");
        System.out.println("Originak state of Deque: " + blockingDeque);
        System.out.println("First: " +  blockingDeque.getFirst());
        System.out.println("Last: " +  blockingDeque.getLast());
        blockingDeque.clear();
        System.out.println("Last after clear: " + blockingDeque.getLast());

    }
}
