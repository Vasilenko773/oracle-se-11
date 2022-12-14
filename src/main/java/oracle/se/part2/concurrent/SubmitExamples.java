package oracle.se.part2.concurrent;

import java.util.Random;
import java.util.concurrent.*;

public class SubmitExamples {

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
        executorService = Executors.newSingleThreadExecutor();
            Future<?> future = executorService.submit(() -> new Random().ints(1,1000)
                    .limit(5)
                    .forEach(System.out::println));
            while (!future.isDone()) {
                Thread.sleep(250);
            }
            System.out.println(future);
            System.out.println(future.get());
            Future<String> future1 = executorService.submit(() -> new Random().ints(1,1000)
                    .limit(5)
                    .forEach(System.out::println), "Thread is finished");
            while (!future1.isDone()) {
                Thread.sleep(250);
            }
            System.out.println(future1);
            System.out.println(future1.get());


            Future<?> future2 = executorService.submit(() -> new Random().ints(1,100_000)
                    .limit(5)
                    .summaryStatistics());
            while (!future2.isDone()) {
                Thread.sleep(250);
            }
            System.out.println(future2);
            System.out.println(future2.get(5, TimeUnit.SECONDS));

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
