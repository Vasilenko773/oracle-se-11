package oracle.se.part2.stream.parallel;

import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamTest {

    public static void main(String[] args) {
       List<String> strings = new ArrayList<>();
       String[] names = {"Anne", "Bob", "Carol", "David", "Evan", "Fred", "George", "Harold", "Ida", "Jack", "Kevin"};

       String result = Arrays.stream(names).peek(System.out::print)
               .reduce(",", (i, j) -> i + j);
        System.out.println(":\n\t serial String concat = "+ result);

        result = Arrays.stream(names)
                .parallel().peek(System.out::print)
                .reduce(",", (i, j) -> i + j);
        System.out.println(":\n\t parralel String concat = "+ result);

        result = Set.of(names).stream()
                .parallel().peek(System.out::print)
                .reduce("", (i, j) -> i + "_" + j);
        System.out.println("::\n\t parralel String concat = "+ result);
        }
    }

