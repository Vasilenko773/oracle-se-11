package oracle.se.part2.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourcesExample {

    private String getPropertyFormFile(String filename, String propertyName) throws IOException {
        String property = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            String name;
            while ((line = br.readLine()) != null) {
                name = line.split("\\s")[0];
                if (name.equals(propertyName)) {
                    property = line.split("\\s")[1];
                }
            }
        } catch (Exception e) {
            System.out.println("Actual code this error");
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Выполенние блока finally");
            br.close();
        }
        return property;
    }

    private String getPropertyValueFormFile(String filename, String propertyName) throws IOException {
        String property = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            String name;
            while ((line = br.readLine()) != null) {
                name = line.split("\\s")[0];
                if (name.equals(propertyName)) {
                    property = line.split("\\s")[1];
                }
            }
        }
        return property;
    }


    public static void main(String[] args) {
        ResourcesExample rex = new ResourcesExample();
//        String propertyName = "First";
//        try {
//            String property = rex.getPropertyFormFile("properies.txt", propertyName);
//            System.out.println("The value of the priperty: " + propertyName + " = " + property);
//        } catch (Exception e) {
//            System.out.println("Surrounding code");
//            e.printStackTrace();
//        }
        System.out.println();
        System.out.println("Try-with-resources");
        String propertyName1 = "Second";
        try {
            String property = rex.getPropertyValueFormFile("properies.txt", propertyName1);
            System.out.println("The value of the priperty: " + propertyName1 + " = " + property);
        } catch (Exception e) {
            System.out.println("Surrounding code");
            e.printStackTrace();
        }
    }
}
























