package com.orgglobal;

public class ApplicationConstance {

    public static final String APP_NAME = "Module Test";

    private static int counter;

    public static void addCounter() {
        counter += 1;
    }

    public static int getCounter() {
        return counter;
    }
}
