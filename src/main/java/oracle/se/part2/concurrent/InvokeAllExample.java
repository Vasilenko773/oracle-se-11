package oracle.se.part2.concurrent;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InvokeAllExample {

    public static void main(String[] args) {
        Collection<Callable<IntSummaryStatistics>> tasks = List.of(() -> InvokeAllExample.doSomeThing(1, 1111),
                () -> InvokeAllExample.doSomeThing(5, 5000),
                () -> InvokeAllExample.doSomeThing(7, 100),
                () -> InvokeAllExample.doSomeThing(100, 10000));
        ExecutorService executorService = null;
        List<Future<IntSummaryStatistics>> result = null;

        try {
            executorService = Executors.newSingleThreadExecutor();
            result = executorService.invokeAll(tasks, 2, TimeUnit.SECONDS); // запускаю выполненние всех задач, возвращает статус по всем задачас в том
            // числе завершихся с исключеним
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                try {
                    executorService.awaitTermination(2, TimeUnit.SECONDS);
                    if (result != null) {
                        for (Future<IntSummaryStatistics> f : result) {
                            System.out.println(f);
                            System.out.println(f.get());
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
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
