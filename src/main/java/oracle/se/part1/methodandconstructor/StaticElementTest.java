package oracle.se.part1.methodandconstructor;

class StaticStuff {
    static final String appName = "A Good App";

    static {
        System.out.println("static block");
        StaticStuff.counter++;
    }

    static void print() {
        System.out.println("Print " + counter + " " + appName);
    }

    static int counter;

}


public class StaticElementTest {

    public static void main(String[] args) {

//        System.out.println("__________");
//
//        System.out.println("app name " + StaticStuff.appName);
//
//        int counter = StaticStuff.counter;
//        System.out.println(counter);
//        staticStuff.print();
        StaticStuff s1 = new StaticStuff();
        s1.print();
        StaticStuff s2 = new StaticStuff();
        s2.print();
        StaticStuff s3 = new StaticStuff();
        s3.print();
        /* Статический класс инициализируеться один раз!!*/
    }
}
