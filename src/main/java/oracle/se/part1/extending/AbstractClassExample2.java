package oracle.se.part1.extending;

abstract class ConceptualClass {
    protected ConceptualClass() {
    }

    public ConceptualClass(String ex) {

    }

    public abstract void printSomething(String s1);
}


class RealClass extends ConceptualClass{

    public RealClass(String ex) {
        super(ex);
    }
    @Override
    public void printSomething(String s1) {
        System.out.println("print " + s1);
    }
}

public class AbstractClassExample2 {

    public static void main(String[] args) {
        RealClass c = new RealClass("Ex");
        c.printSomething("Hello world");
    }
}
