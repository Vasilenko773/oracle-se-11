package oracle.se.incapsulation.packagetwo;

import oracle.se.incapsulation.packaheone.LevelTwoClass;

class LeveThreeClass extends LevelTwoClass {
    LeveThreeClass() {
        this("good");
        System.out.println("default tree constructor  ");
    }

    private LeveThreeClass(String text) {
        super();
        System.out.println("private tree constructor");
    }
}

public class ConstructorAccess {

    public static void main(String[] args) {
        LeveThreeClass l = new LeveThreeClass();
    }
}
