package oracle.se.part2.interfaces;

public interface MoreSpecificDefaultable extends Defaultable {

    void defaultNotAbstractMethod();
}

class MoreSpecific extends DefaultClass implements Defaultable, MoreSpecificDefaultable {


    @Override
    public void abstractMethod() {
        defaultNotAbstractMethod();
    }

    public static void main(String[] args) {
        new MoreSpecific().abstractMethod();
    }
}
