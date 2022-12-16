package oracle.se.part2.concurrent;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequePols {

    public static void main(String[] args) {
        List staticList = List.of("Jane", "Ralph", "Anne", "Mary", "Ralph", "Anne", "Harold", "Anne", "John", "Carol");
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(staticList);
        userPollMethods(blockingDeque);
        blockingDeque.addAll(staticList);
        userRemoveMethods(blockingDeque);
        blockingDeque.addAll(staticList);
        userPopMethod(blockingDeque);
        blockingDeque.addAll(staticList);
    }

    private static  void  userPollMethods(BlockingDeque<String> blockingDeque) {
        System.out.println("__________ Poll Methods_____________");
        System.out.println("Originak state of Deque: " + blockingDeque);
        String dequedPerson = blockingDeque.poll();
        System.out.println("After poll(), " + dequedPerson + " was removed: " + blockingDeque);
        dequedPerson = blockingDeque.pollLast();
        System.out.println("After pollLast(), " + dequedPerson + " was removed: " + blockingDeque);
        dequedPerson = blockingDeque.pollFirst();
        System.out.println("After pollFirst(), " + dequedPerson + " was removed: " + blockingDeque);
        blockingDeque.clear();
        System.out.println("After clearing the deque");
        dequedPerson = blockingDeque.poll();
        System.out.println("After poll(), " + dequedPerson + " was removed: " + blockingDeque);
    }

    private static void userRemoveMethods(BlockingDeque<String> deque) {
        System.out.println("------------ Removed Methods-----------");
        System.out.println("Original state of Deque: " + deque);
        String name = deque.remove();
        System.out.println("After remove(), " + name + " was removed: " + deque);

        boolean isRemoved = deque.remove("Ralph");
        System.out.println("After remove(Ralph) wasRemoved " + isRemoved + " : " + deque);
        name = deque.removeLast();
        System.out.println("After removeLast(), " + name + " was removed: " + deque);
        name = deque.removeFirst();
        System.out.println("After removeFirst(), " + name + " was removed: " + deque);
    }

    private static void userPopMethod(BlockingDeque<String> deque) {
        System.out.println("-------Pop Method---------");
        System.out.println("Original state of Deque: " + deque);

        String name = deque.pop();
        System.out.println("after pop " + name );
    }
}
