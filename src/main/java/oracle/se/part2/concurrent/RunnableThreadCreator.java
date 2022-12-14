package oracle.se.part2.concurrent;

import lombok.AllArgsConstructor;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

@AllArgsConstructor
class NumberGenerator extends Number implements Runnable {
    private int seed = 1;


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void run() {
        Stream<Integer> integerStream = Stream.iterate(this.seed, (t) -> t + this.seed);
       try {
        integerStream.forEach(s -> {
            try {
                sleep(500);
            } catch (InterruptedException ie) {
                throw new RuntimeException("interrupted");
            }
            System.out.print( ": " + s + " ");
        });
    } catch (RuntimeException re) {
        System.out.println("\nInterrupted the thread execution");
    }
    }
}

public class RunnableThreadCreator {

    public static void main(String[] args) throws InterruptedException {
        Thread n = new Thread(new NumberGenerator(100)::run);

        n.start();
        Thread.sleep(3000);
        n.interrupt();

        while (n.isAlive()) {
            System.out.println("\nWaiting for " + n.getName() + " to terminate");
            Thread.sleep(150);
        }
    }
}
