package oracle.se.part2.concurrent;

import java.util.stream.Stream;

class MyCustomThread extends Thread {
    private int seed;

    MyCustomThread(String name, int seed) {
        super(name);
        this.seed = seed;
    }

    public void run() {
        Stream<Integer> integerStream = Stream.iterate(this.seed, (t) -> t + this.seed);
        try {
            integerStream.forEach(s -> {
                try {
                    sleep(500);
                } catch (InterruptedException ie) {
                    throw new RuntimeException("interrupted");
                }
                System.out.print(this.getName() + ":: " + s + " ");
            });
        } catch (RuntimeException re) {
            System.out.println("\nInterrupted " + this.getName() + " execution");
        }
    }
}

public class CustomThreadCreator {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyCustomThread("Fives", 5);
        Thread v = new MyCustomThread("Sevens", 7);
        t.start();
        v.start();
        Thread.sleep(3000);
        v.interrupt();
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1500);
            System.out.println("\nmain thread executing " + i);
        }
        Thread.sleep(3000);
        t.interrupt();


        while (t.isAlive()) {
            System.out.println("\nWaiting for " + t.getName() + " to terminate");
            Thread.sleep(150);
        }
        System.out.println("\nAll threads interrupted Terminating");
    }
}
