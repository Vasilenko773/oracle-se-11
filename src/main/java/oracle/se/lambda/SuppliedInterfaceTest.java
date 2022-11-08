package oracle.se.lambda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SuppliedInterfaceTest {

    public static void main(String[] args) {

        String[] dictionary = {"Apple", "Art", "Ball", "Box", "Car", "Cap", "Dog", "Duck"};
        Consumer<String> str = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(0, "MyApplication");
            sb.insert(0, LocalDateTime.now().toLocalTime() + " ");
            System.out.println(sb);
        };
        str.accept("I want to log this statment");

        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        ArrayList<String> a = new ArrayList<>(Arrays.asList(dictionary));
        a.removeIf(aWords);
        System.out.println(a);
    }
}
