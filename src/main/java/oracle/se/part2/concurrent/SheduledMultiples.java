package oracle.se.part2.concurrent;

import java.util.IntSummaryStatistics;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class SheduledMultiples {

    private static long talley;

    private static void addRoTallye(long count) {
        talley += count;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Runnable r1 = () -> {
            IntSummaryStatistics sums = SheduledMultiples.dosomething(3, 15);
            System.out.println(sums);
            SheduledMultiples.addRoTallye(sums.getCount());
        };

        ScheduledFuture<?> rsl = null;
        ScheduledExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadScheduledExecutor();
            rsl = executorService.scheduleWithFixedDelay(r1, 2, 1, TimeUnit.SECONDS);

            while (SheduledMultiples.talley < 25) {
                Thread.sleep(300);
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                executorService.awaitTermination(4, TimeUnit.SECONDS);
                    System.out.println(talley);
            }
        }
    }

    private static IntSummaryStatistics dosomething(int seed, int maxNumber) {
        return Stream.iterate(seed, s -> s <= maxNumber, t -> t + seed)
                .mapToInt(s -> s)
                .summaryStatistics();
    }
}
