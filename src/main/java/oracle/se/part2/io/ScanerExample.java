package oracle.se.part2.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ScanerExample  {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("SomeData.csv");
        createTheFile(path);

        String line;
        String word;
        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println(line);
                try (Scanner lineScanner = new Scanner(line).useDelimiter(",")){
                    while (lineScanner.hasNext()) {
                        word = lineScanner.next();
                        System.out.println("\t" + word);
                    }
                }
            }
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
