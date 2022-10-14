package oracle.se.importandpackage.b;

public class StaticImportTest2 {

    public final static String APP_NAME = "SECOND";

    public static void log(String statement) {
        System.out.println("StaticImportTest2 statement: " + statement);
    }

    public void uniqueStatement() {
        System.out.println("I am Second");
    }
}
