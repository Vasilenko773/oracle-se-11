package oracle.se.part1.operators;

import java.util.List;

public class Switch {

    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C", "D");
        int iteration = 0;
        for (var s : strings) {
            System.out.println(++iteration + " " + s);
            switch (s) {
                case "A":
                    System.out.println("DO A");
                default:
                    System.out.println("THIS");
                case "B":
                    System.out.println("DO B");
                case "C":
                    System.out.println("DO C");
            }
        }
    }
}
