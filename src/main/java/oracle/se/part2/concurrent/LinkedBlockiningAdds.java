package oracle.se.part2.concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockiningAdds {
    public static void main(String[] args) {
        BlockingDeque<String> dequeBlocked = new LinkedBlockingDeque<>(4);
        useOfferMethods(dequeBlocked);
        dequeBlocked.clear();
        System.out.print("\n");
        useAddMethods(dequeBlocked);
        dequeBlocked.clear();
        System.out.print("\n");
        usePushMethod(dequeBlocked);
        dequeBlocked.clear();
    }

    private static void useOfferMethods(BlockingDeque<String> blockingDeque) {
        boolean wasSuccessfuk = blockingDeque.offer("Jane");
        wasSuccessfuk = blockingDeque.offer("Anne");
        wasSuccessfuk = blockingDeque.offerLast("John");
        wasSuccessfuk = blockingDeque.offerLast("Mary");
        wasSuccessfuk = blockingDeque.offer("Harrold");
        System.out.println(blockingDeque);
        if (wasSuccessfuk) {
            System.out.println("Harrold was added successfully");

        } else {
            System.out.println("Harrold could not be added");
        }
    }

    public static void useAddMethods(BlockingDeque<String> blockingDeque) {
        boolean wasSuccessfuk = blockingDeque.add("Anne");
        blockingDeque.addLast("John");
        blockingDeque.addFirst("Mary");
       blockingDeque.addFirst("Anne");
        System.out.println(blockingDeque);
        try {
            wasSuccessfuk = blockingDeque.add("Harrold");
            if (wasSuccessfuk) System.out.println("Harrold was added");
        } catch (IllegalStateException ise) {
            System.out.println("Harold could not be added: " + ise);
        }
    }

    public static void usePushMethod(BlockingDeque<String> blockingDeque) {
        blockingDeque.push("Mary");
        blockingDeque.push("Jane");
        blockingDeque.push("Jogn");
        blockingDeque.push("Anne");
        System.out.println(blockingDeque);
        try {
            blockingDeque.push("Harrold");
            System.out.println("harrold wa added");
        } catch (IllegalStateException e) {
            System.out.println("Harrold could not be added: " + e);
        }
    }
}
