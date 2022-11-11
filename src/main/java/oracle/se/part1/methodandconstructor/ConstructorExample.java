package oracle.se.part1.methodandconstructor;

import lombok.Getter;

class ATest {
    ATest() {
        System.out.println("I an constructor ATest");
    }
}

@Getter
class BTest extends ATest {
    private String name;

    BTest() {
    }

    BTest(String name) {
        this.name = name;
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        BTest bTest = new BTest("first");
        System.out.println(bTest.getName());
        System.out.println("========");
        BTest bTest1 = new BTest();
        System.out.println(bTest1);
    }
}
