package oracle.se.part2.interfaces.functionInterfaces;

import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        Predicate<String> p1 = (s -> s.equals("hello"));
        System.out.println(p1.test("hello"));
        Predicate<String> p2 = p1.negate();
        System.out.println(p2.test("hello"));

        Predicate<Integer> p3 = i -> i < 1;
        Predicate<Integer> p4 = i -> i < 10;
        Predicate<Integer> p5 = p3.or(p4);
        System.out.println(p5.test(-11));
        Predicate<Integer> p6 = p3.and(p4);
        System.out.println(p6.test(-11));
    }
}
