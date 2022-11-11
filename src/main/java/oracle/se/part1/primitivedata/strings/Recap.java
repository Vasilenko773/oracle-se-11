package oracle.se.part1.primitivedata.strings;

public class Recap {

    public static void main(String[] args) {
        equalLiteralReferences(); //true
        equalConstructorsReferences(); // false
        equalConstructorsInterned(); // true
    }

    public static void equalLiteralReferences() {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
    }

    public static void equalConstructorsReferences() {
        String s1 = new String("Hi");
        String s2 = new String("Hi");
        System.out.println(s1 == s2);
    }

    public static void equalConstructorsInterned() {
        String s1 = new String("Hi").intern();
        String s2 = new String("Hi").intern();
        System.out.println(s1 == s2);
    }
}
