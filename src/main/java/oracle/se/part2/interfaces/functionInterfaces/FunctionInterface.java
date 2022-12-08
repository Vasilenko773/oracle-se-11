package oracle.se.part2.interfaces.functionInterfaces;

interface Doable {
    void doIt();
}

public class FunctionInterface {

    public interface Shapeable {
        void shapeIt();
    }

    public static void main(String[] args) {
        Doable d = () -> System.out.println("Lambda class");
        ExtendedDoable ex = () -> System.out.println("Lambda in ExtendedDoable");
        Shapeable s = () -> System.out.println("Lambda class Shapeable");

        d.doIt();
        s.shapeIt();
    }

    private static void doIt(Doable d) {
        d.doIt();
    }

    private static void doShapble(Shapeable s) {
        s.shapeIt();
    }
}

interface ExtendedDoable extends Doable {

}
