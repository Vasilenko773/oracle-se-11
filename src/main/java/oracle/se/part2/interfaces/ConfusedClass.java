package oracle.se.part2.interfaces;

interface Walkable {
    void walk();

    default float getGait() {
        return 3.5f;
    }
}

interface Strollable {
    void stroll();

    default float getGait() {
        return 2.5f;
    }
}

public class ConfusedClass implements Walkable, Strollable {

    @Override
    public void walk() {
        System.out.println("walk in ConfusedClass ");
    }

    @Override
    public void stroll() {
        System.out.println("stroll in ConfusedClass ");
    }

    public static void main(String[] args) {
        ConfusedClass c = new ConfusedClass();
        c.walk();
        c.stroll();
    }

   public float getGait() {
        return Walkable.super.getGait();
    }
}