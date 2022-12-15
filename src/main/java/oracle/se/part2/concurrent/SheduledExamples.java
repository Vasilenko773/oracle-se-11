package oracle.se.part2.concurrent;

import java.util.IntSummaryStatistics;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class SheduledExamples {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable r1 = () -> SheduledExamples.doSomething(3, 15);
        Callable r2 = () -> SheduledExamples.doSomething(5, 15);
        ScheduledFuture<?> rsl = null;
        ScheduledFuture<?> rsl1 = null;
        ScheduledExecutorService scheduledExecutorService = null;
        try {
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            rsl = scheduledExecutorService.schedule(r1, 3, TimeUnit.SECONDS);
            System.out.println("Times " + rsl.getDelay(TimeUnit.SECONDS));

            rsl1 = scheduledExecutorService.schedule(r2, 4, TimeUnit.SECONDS);
            System.out.println("Times " + rsl1.getDelay(TimeUnit.SECONDS));
        } finally {
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                scheduledExecutorService.awaitTermination(4, TimeUnit.SECONDS);
                if (rsl.isDone()) {
                    System.out.println(rsl.get());
                }
                if (rsl1.isDone()) {
                    System.out.println(rsl1.get());
                }
            }
        }
    }

    public static IntSummaryStatistics doSomething(int seed, int maxNumber) {
        return Stream.iterate(seed, s -> s <= maxNumber, t -> t + seed)
                .mapToInt(s -> s)
                .peek(s -> {
                    System.out.print(seed + " " +  s );
                    if (s == maxNumber) System.out.println("");
                })
                .summaryStatistics();
    }
}
