package oracle.se.part1.extending;

class ConcreteExample extends AbstractClassExample {
    @Override
    String doThis() {
        return "doThis";
    }

    @Override
    String doThat() {
        return "doThat";
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        ConcreteExample.doThisOnlyThis();

        ConcreteExample c = new ConcreteExample();
        c.doThisAndThat();

    }
}

