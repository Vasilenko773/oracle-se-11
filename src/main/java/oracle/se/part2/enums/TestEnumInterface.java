package oracle.se.part2.enums;

interface DoItInterface {
    void doIt();
}

;enum SecondaryColors implements DoItInterface {
    ORANGE,
    PURPLE {
        public void doIt() {
            System.out.println("overload method in PURPLE CONSTANT");
        }
    },
    GREEN;
    @Override
    public void doIt() {
        System.out.println("Enum method");
    }
}

public class TestEnumInterface {

    public void printData(DoItInterface o) {
        o.doIt();
    }

    public static void main(String[] args) {
        TestEnumInterface test = new TestEnumInterface();
        test.printData(SecondaryColors.ORANGE);
        test.printData(SecondaryColors.PURPLE);
    }
}
