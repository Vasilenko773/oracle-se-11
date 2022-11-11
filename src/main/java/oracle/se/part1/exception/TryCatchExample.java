package oracle.se.part1.exception;

public class TryCatchExample {

    public static void main(String[] args) {
        TryCatchExample te = new TryCatchExample();
        te.printThreeStatements("1", 1);
        try {
            te.printThreeStatements("2", 0);
        } catch (Throwable t) {
            t.printStackTrace(System.out);
            printErrorStructure(t);
        }
        te.printThreeStatements("3", 0);
    }

    public static void printErrorStructure(Object o) {
        Class parent = o.getClass();
        String prefix = "";
        System.out.println("Error");
        do {
            System.out.println(prefix + " " + parent.getName());
            prefix += "--";
            parent = parent.getSuperclass();
            if (parent.getSuperclass() != null) ;
        } while (parent.getSuperclass() != null);
    }

    private void printThreeStatements(String s, int division) {
        System.out.println(s + "first");
        System.out.println(s + "second" + (2 / division));
        System.out.println("third");
    }


}
