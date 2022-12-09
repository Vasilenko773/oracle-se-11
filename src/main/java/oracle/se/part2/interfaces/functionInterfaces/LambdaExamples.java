package oracle.se.part2.interfaces.functionInterfaces;

interface Viewable {
    void view();
}

public class LambdaExamples {
    private final static Viewable staticViewable = () -> System.out.println("Static Variable lambda");
    private final Viewable privateViewable = () -> System.out.println("Instance Variable Lambda");

    private static void viewIt(Viewable v) {
        v.view();
    }

    public static void main(String[] args) {
        Viewable localViewable = () -> {
            System.out.println("Local Variable Lambda");
        };
        viewIt(localViewable);
        viewIt(staticViewable);
        viewIt(new LambdaExamples().privateViewable);
        viewIt(() -> System.out.println("Local initializate interfaces"));

        for (String s : new String[]{"first", "second", "third"}) {
            viewIt(() -> System.out.println("ForEach " + s));
        }
    }
}
