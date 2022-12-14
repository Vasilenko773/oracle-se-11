package oracle.se.part2.concurrent;

import java.util.Random;
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


        System.out.println("\nDemonstration using join");
        Thread n2 = new Thread() {
           public void run() {
               new Random().ints(10,1,100).forEach(System.out::println);
           }
        };
        n2.start();
        n2.join();
        System.out.println("The status of thread after join: ");
        System.out.println("n2.isAlive=" + n2.isAlive());
        System.out.println("n2.sInterrupted=" + n2.isInterrupted());
    }
}
