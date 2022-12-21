package oracle.se.part2.io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class ConsoleExamples {

    public static void main(String[] args) throws IOException {
        String name;
        Console console;
        LocalDateTime currentDate = LocalDateTime.now();
        if ((console = System.console()) != null) {
            console.printf("Interacting with user via Console \n");
            name = console.readLine("What is uor name? ");
            console.writer().println("Your input is apureciated, " + name);
            console.format("The local date ant time is: " + currentDate);
        } else {
            System.out.println("Interacting with user via standard input/output"  );
            System.out.println("What is your name? ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            name = reader.readLine();
            System.out.println("Your input is apureciated, " + name);
            System.out.println("The local date ant time is: " + currentDate);
        }

    }
}
