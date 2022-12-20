package oracle.se.part2.stream.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamCreation {

    public static void main(String[] args) {
        List<Integer> integerList = Stream.iterate(1, i -> i + 1).limit(20).collect(Collectors.toList());
        System.out.println("Stream parallel");
        for (int i = 0; i < 5; i++) {
            integerList.stream().parallel().forEach(s -> System.out.print(s + " "));
            System.out.println();
        }

        System.out.println("Collection parallelStream");
        for (int i = 0; i < 5; i++) {
            integerList.parallelStream().map(s -> {
                s = s + 1;
                return s;
            }).forEachOrdered(s -> System.out.print(s + " "));
            System.out.println();
        }
    }
}
