package oracle.se.part2.concurrent;

import java.util.concurrent.*;

public class LinkedBlockiningAdds {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> dequeBlocked = new LinkedBlockingDeque<>(4);
        useOfferMethods(dequeBlocked);
        dequeBlocked.clear();
        System.out.print("\n");
        useAddMethods(dequeBlocked);
        dequeBlocked.clear();
        System.out.print("\n");
        usePushMethod(dequeBlocked);
        dequeBlocked.clear();
        System.out.print("\n");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        var thread = service.scheduleAtFixedRate(() -> {
            System.out.println("popping queue");
            System.out.println("Got " + dequeBlocked.pop());
            System.out.println("dequeBlocked " + dequeBlocked);
        }, 2, 2, TimeUnit.SECONDS);
        useOfferMethodsTimed(dequeBlocked);
        Thread.sleep(5000);
        service.shutdown();
        service.awaitTermination(20, TimeUnit.SECONDS);

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

    private static void useOfferMethodsTimed(BlockingDeque<String> deque) throws InterruptedException {
        boolean wasSuccessfuk = deque.offer("Jane", 1, TimeUnit.SECONDS);
        deque.offer("Anne", 1, TimeUnit.SECONDS);

        wasSuccessfuk = deque.offerLast("John", 1, TimeUnit.SECONDS);
        wasSuccessfuk = deque.offerFirst("Marry", 1, TimeUnit.SECONDS);
        System.out.println(deque);
        wasSuccessfuk = deque.offer("Harrold", 1, TimeUnit.SECONDS);
        if (wasSuccessfuk) {
            System.out.println("Harrold was added successfully");
        } else {
            System.out.println("Harrold could not be added t");
        }
        wasSuccessfuk = deque.offerFirst("Ida", 15, TimeUnit.SECONDS);
        if (wasSuccessfuk) {
            System.out.println("Ida was added successfully");
        } else {
            System.out.println("Ida could not be added");
        }
    }
}
