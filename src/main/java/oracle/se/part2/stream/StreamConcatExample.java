package oracle.se.part2.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamConcatExample {

    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>(List.of("v", "m"));
        Set<String> set2 = new TreeSet<>(List.of("a", "b"));
        Stream<String> stream1 = set1.stream();
        Stream<String> stream2 = set2.stream();
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        stream3.distinct().forEach(System.out::println);

    }
}
