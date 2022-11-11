package oracle.se.part1.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinalyExample {

    public static void main(String[] args) {
        FinalyExample fx = new FinalyExample();
        try {
            System.out.println("try");
            String property = fx.getPropertyFromFile("finallyProperty");

        } catch (IOException io) {
            System.out.println("Other tatch exception");
            try {
                System.out.println("try try");
                String line = fx.getPropertyFromFile("AnotherProperty");
            } catch (IOException e) {
                System.out.println("iner cath");
            }
        }
    }

    private String getPropertyFromFile(String s) throws IOException {
        String property;
        BufferedReader br = new BufferedReader(new FileReader(s));

        try {
            String line = br.readLine();
            property = line.split("")[1];
            System.out.println(property);
        } finally {
            if (br != null) br.close();
        }
        return property;
    }
}
