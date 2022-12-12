package oracle.se.part2.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(5, t -> t + 5);
        integerStream.limit(10).forEach(System.out::println);

        Stream.Builder<String> builder = Stream.builder();
        for (String s : List.of("first", "second", "third")) {
            builder.accept(s);
        }
        Stream<String> wordStream = builder.build();
        wordStream.forEach(System.out::println);
    }
}
