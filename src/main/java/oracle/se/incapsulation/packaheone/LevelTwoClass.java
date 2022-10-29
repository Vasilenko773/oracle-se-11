package oracle.se.incapsulation.packaheone;

class LevelOneClass{

    protected LevelOneClass() {
        System.out.println("protected level one constructor");
    }

    LevelOneClass(String text) {
        System.out.println("default level one constructor");
    }

}

public class LevelTwoClass extends LevelOneClass{

    protected LevelTwoClass() {
        System.out.println("protected two constructor");
    }

    LevelTwoClass(String text) {
        System.out.println("default two constructor");
    }
}
