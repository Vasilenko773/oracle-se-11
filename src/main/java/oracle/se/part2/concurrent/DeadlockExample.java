package oracle.se.part2.concurrent;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class Neighbor {
    private final String name;

    public synchronized void greet(Neighbor neighbor) {
        System.out.println("Hi " + neighbor.name + ", how are you?");
        System.out.println(this.name + "s thread is blocked, waiting for " + neighbor.name + " to respond before releasing lock");
        neighbor.respond(this);
    }

    public void respond(Neighbor neighbor) {
        System.out.println("I an fine" + neighbor.name);
    }
}

public class DeadlockExample {

    public static void main(String[] args) {
        Neighbor dave = new Neighbor("dave");
        Neighbor craig = new Neighbor("craig");
        new Thread(() -> dave.greet(craig)).start();
        new Thread(() -> craig.greet(dave)).start();
    }
}
