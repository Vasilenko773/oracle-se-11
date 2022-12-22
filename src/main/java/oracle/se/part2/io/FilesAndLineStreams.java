package oracle.se.part2.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FilesAndLineStreams {

    public static void main(String[] args) {
        Path p = Paths.get("SomeData.csv");
        createTheFile(p);
        try {
            Files.readAllLines(p).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        try (Stream<String> stream = Files.lines(p)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    private static void createTheFile(Path p) {
        try {
            Files.deleteIfExists(p);
            List<String> list = List.of("" +
                            "1,George,ABC",
                    "2,Ralph,DEF",
                    "3,Bob,EFG",
                    "4,Arthur,ABC",
                    "5,Maggie,ABC",
                    "6,Carlos,DEF",
                    "7,Brandy,EFG"
            );
            Files.write(p, list);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
