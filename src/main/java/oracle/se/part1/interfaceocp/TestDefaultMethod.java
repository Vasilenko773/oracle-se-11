package oracle.se.part1.interfaceocp;

interface Teachable {

    default void teachTheseLessons() {
        System.out.println("default method");
    }

    void teach();
}

interface Trainable {

    default void teachTheseLessons() {
        System.out.println("default method trainable");
    }

    void train();
}

public class TestDefaultMethod implements Teachable, Trainable {
    @Override
    public void teach() {
        teachTheseLessons();
    }

    public void train() {
        System.out.println("train method testdefault");
    }

    public void teachTheseLessons() {
        System.out.println("Переопределил метол");
    }

    public static void main(String[] args) {
        TestDefaultMethod t = new TestDefaultMethod();
        t.teach();
        t.train();
    }
}
