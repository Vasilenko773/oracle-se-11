package oracle.se.importandpackage.a;

public class StaticImportTest1 {

    public final static String APP_NAME = "FIRST";

    public static void log(String statement) {
        System.out.println("StaticImportTest1 statement: " + statement);
    }

    public void uniqueStatement() {
        System.out.println("I am First");
    }
}
