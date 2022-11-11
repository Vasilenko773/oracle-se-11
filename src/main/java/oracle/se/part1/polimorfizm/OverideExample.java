package oracle.se.part1.polimorfizm;

class BaseClass {
    public void goodMethod() {
        System.out.println("BaseClass executing good method");
    }

    public void printInformation(CharSequence s) {
        System.out.println("BaseClass " + s);
    }

    public CharSequence getInformation() {
        return getClass().getName();
    }
}

class ExtendedClass extends BaseClass {

    public void goodMethod() {
        super.goodMethod();
        System.out.println("ExtendedClass executing good method");
    }

    public void printInformation(String s) {
        System.out.println("ExtendedClass " + s);
    }
   public String getInformation() {
        return getClass().getName();
    }

}

public class OverideExample {


    public static void main(String[] args) {
        ExtendedClass e = new ExtendedClass();
        e.goodMethod();
        e.printInformation(e.getInformation());
        e.printInformation((CharSequence) e.getInformation());

    }
}
