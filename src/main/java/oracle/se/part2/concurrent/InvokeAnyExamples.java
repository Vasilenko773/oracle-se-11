package oracle.se.part2.concurrent;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class InvokeAnyExamples {


    public static void main(String[] args) {
        Collection<Callable<IntSummaryStatistics>> tasks = List.of(() -> InvokeAnyExamples.doSomeThing(1, 1111),
                () -> InvokeAnyExamples.doSomeThing(1, 1110),
                () -> InvokeAnyExamples.doSomeThing(1, 1109),
                () -> InvokeAnyExamples.doSomeThing(1, 1112));
        ExecutorService executorService = null;
        IntSummaryStatistics rsl = null;

        try {
            executorService = Executors.newCachedThreadPool();
           rsl = executorService.invokeAny(tasks);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                try {
                    executorService.awaitTermination(2, TimeUnit.SECONDS);
                    if (rsl != null) {
                            System.out.println(rsl);
                    }
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static IntSummaryStatistics doSomeThing(int seed, int limit) {
        return Stream.iterate(seed, (t) -> t + seed)
                .limit(limit)
                .mapToInt(s -> s)
                .summaryStatistics();
    }
}


