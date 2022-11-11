package oracle.se.part1.object;

final class FinalClass{
    private String name;
    FinalClass(String name){
        this.name = name;
    }

    void doSomething() {
        System.out.println("Private class");
    }
}


public class FinalClassExample {

    public static void main(String[] args) {
        FinalClass f = new FinalClass("f");
        FinalClass s = new FinalClass("s");
        f.doSomething();

    }
}
