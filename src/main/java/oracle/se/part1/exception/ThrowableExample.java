package oracle.se.part1.exception;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class ThrowableExample {

    public static void main(String[] args) {
        ThrowableExample te = new ThrowableExample();
        String filename = "this file does not exist";

 //       te.throwAnError();
        try {

            FileInputStream f = new FileInputStream(filename);
        } catch (Throwable e) {
            if (e instanceof IOException) {
                System.out.println("IO exception bat filename " + filename);
            }
            printErrorStructure(e);
        }
    }

    public static void printErrorStructure(Object o) {
        Class parent = o.getClass();
        String prefix = "";
        System.out.println("Error");
        do {
            System.out.println(prefix + " " + parent.getName());
            prefix += "--";
            parent = parent.getSuperclass();
            if (parent.getSuperclass() != null);
        } while (parent.getSuperclass() != null);
    }

    private void throwAnError() throws IOError {
        throw new IOError(new Throwable("Testing"));
    }
}
