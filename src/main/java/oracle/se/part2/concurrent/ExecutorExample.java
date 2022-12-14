package oracle.se.part2.concurrent;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(ExecutorExample::doSomethingThreadOne);
        Future<?> submit = executorService.submit(ExecutorExample::doSomethingThreadTwo);

        for (int i = 0; i < 11; i++) {
            System.out.println("Main thread: iteration " + i);
            Thread.sleep(250);
            if (i == 7) {
                if (!submit.isDone()) {
                    submit.cancel(true);
                    System.out.println("Was able to cancel using " + submit.getClass().getName());
                }
            }
        }
        executorService.shutdown();
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("all done");
    }

    private static void doSomethingThreadOne() {
        for (int i = 0; i < 6; i++) {
            System.out.println("----First Thread: iteration " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private static void doSomethingThreadTwo() {
        for (int i = 10; i > 5; i--) {
            System.out.println("---- Second thread: iteration " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
