package oracle.se.exception;

import java.io.IOException;

public class AFinalTry {
    public static void main(String[] args) {
        someMethodThrowsException();
    }

    public static void someMethodThrowsException() {
        try {
            System.out.println("Doing something");
        } catch (Exception e) {
            throw new IOException("testing catch");
        } finally {
            throw new RuntimeException("testing finally");
        }
    }
}
