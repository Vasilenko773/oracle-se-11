package oracle.se.part2.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileIoExample {

    private static void writeRandomNumbersToFile(String fileName) throws IOException {
        Random r = new Random();
        String numberList;
        try (FileWriter out = new FileWriter(fileName)){
            for (int i = 0; i < 100; i++) {
                numberList = r.ints(25, 1, 100).mapToObj(s -> String.valueOf(s))
                        .reduce("", (s, e) -> String.join(" ", s, e));
                out.write(numberList + "\n");
            }
        }
    }

    private static List<Integer> readRandomNumbersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader inStream = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = inStream.readLine()) != null) {
                Arrays.asList(line.split(" ")).forEach(s -> {
                    try {
                        numbers.add(Integer.parseInt(s));
                    } catch (Exception e) {
                    }
                });
            }
        }
        return numbers;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> data = readRandomNumbersFromFile("characterData.txt");
        System.out.println(data.size());
    }
}
