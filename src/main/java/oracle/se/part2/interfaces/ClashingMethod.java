package oracle.se.part2.interfaces;

interface FirstInterface {
    default void methodA() {
        System.out.println("FirstInstance private method");
    }
}

interface SecondInterface {
    default void methodA() {
        System.out.println("SecondInterface static method");
    }
}

public class ClashingMethod implements FirstInterface{

    public static void main(String[] args) {
        ClashingMethod f = new ClashingMethod();
        f.methodA();
    }



}
