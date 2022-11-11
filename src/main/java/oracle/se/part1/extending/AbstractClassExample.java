package oracle.se.part1.extending;

public abstract class AbstractClassExample {

    public static final String ABSTRACT_CONSTANT = "Abstract";

    public static final void doThisOnlyThis() {
        System.out.println("static final method ");
    }

    public final void doThisAndThat() {
        System.out.println("my final method");
        System.out.println(doThis() + " " + doThat());
    }

    abstract String doThis();

    abstract String doThat();
}
