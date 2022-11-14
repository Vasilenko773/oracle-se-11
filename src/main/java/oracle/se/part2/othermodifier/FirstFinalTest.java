package oracle.se.part2.othermodifier;


class ExtendMeOptional {

    public void doSomething() {
        System.out.println("doSomething in ExtendMeOptional class");
    }

    public final void doSomethingFinal() {
        System.out.println("doSomethingFINAL in ExtendMeOptional class");
    }
}

final class ExtendMeNotAllowed {

    public void doSomething() {
        System.out.println("doSomething in ExtendMeNotAllowed class");
    }

    public final void doSomethingFinal() {
        System.out.println("doSomethingFINAL in ExtendMeNotAllowed class");
    }
}

class MyFirstExtendedClass extends ExtendMeOptional {

    public void doSomething() {
        System.out.println("extended doSomething in MyFirstExtendedClass class");
    }

//    public final void doSomethingFinal() {
//        System.out.println("doSomethingFINAL in ExtendMeOptional class");
//    }
//    При попытке переопределить финальный метод произойдет ошибка компилятора
}

public class FirstFinalTest {

    public static void main(String[] args) {
        ExtendMeOptional obj1 = new ExtendMeOptional();
        obj1.doSomething();
        obj1.doSomethingFinal();
        System.out.println("_________");
        ExtendMeNotAllowed obj2 = new ExtendMeNotAllowed();
        obj2.doSomething();
        obj2.doSomethingFinal();
        System.out.println("_________");
        MyFirstExtendedClass obj3 = new MyFirstExtendedClass();
        obj3.doSomething();
        obj3.doSomethingFinal();
    }
}
















