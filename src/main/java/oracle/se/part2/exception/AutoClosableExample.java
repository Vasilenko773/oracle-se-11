package oracle.se.part2.exception;

class Door implements AutoCloseable {

    public void close() {
        System.out.println("close in class Door");
    }

    public void doSomeThing() throws NullPointerException {
        throw new NullPointerException(this.getClass().getName() + " is null");
    }
}

class Alarm implements AutoCloseable {

    public void close() {
        System.out.println("close in class Alarm");
    }
}

public class AutoClosableExample {

    public static void main(String[] args) {
        try (Alarm a = new Alarm();
             Door d = new Door()) {
        }

        System.out.println("+++++++++");
        try (Alarm alarm = new Alarm();
             Door d = new Door()) {
            System.out.println("Внутри try");
            d.doSomeThing();
        } catch (NullPointerException ne) {
            System.out.println(ne);
        } finally {
            System.out.println("resources are closed so u can go");
        }
    }
}
