package oracle.se.part2.stream;

import java.util.stream.Stream;

public class BuilderExtrass {

    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        builder = builder.add("a");
        builder.add("b");
        builder.add("c");
       builder.build().limit(1).count();

       // stream.forEach(System.out::println);
       // stream.filter(i -> i.isEmpty());
      //  builder.add("d");
        Stream.builder().add("first").add("secind").add("third").build().forEach(System.out::println);

    }
}
