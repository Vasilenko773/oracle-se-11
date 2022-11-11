package oracle.se.part1.interfaceocp;

interface Confusable {
    String name = "Confusable";

    String confuse();
}

abstract class Confused {
    public static String name = "Confused";
    abstract Object confuse();
}

public class AmbiguousExample extends Confused implements Confusable{
    public static void main(String[] args) {
        AmbiguousExample a = new AmbiguousExample();
        System.out.println(a.confuse());
    }

    @Override
    public String confuse() {
        return Confused.name;
    }
}
