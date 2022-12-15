package oracle.se.part2.concurrent;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new  CyclicBarrier(4,
                () -> {
            System.out.println("Confrming step is complete");
        });

        Callable<Boolean> r = () -> {
            step(1);
            cyclicBarrier.await();
            step(2);
            return true;
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.invokeAll(List.of(r, r, r, r));
        System.out.println("Shutting service down");
        service.shutdown();
    }

    public static void step(int stepNo) throws InterruptedException {
        int ms = new Random().nextInt(5) * 1000;
        System.out.println(Thread.currentThread().getName() + " " + ms + " step " + stepNo);
        Thread.sleep(ms);
    }
}
