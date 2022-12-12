package oracle.se.part2.interfaces.functionInterfaces;

import java.util.function.Function;

public class AndThenExamples {

    public static void main(String[] args) {
        Function<String, String> function;
        function = (s -> s);
        function = function.andThen(s -> {
                    System.out.println("first andThen");
                return s;});
        System.out.println(function.andThen(s -> {
            System.out.println("second andThen");
       return s; }).apply("test"));
    }
}
