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
        System.out.println("_________");
        ExtendMeRequired obj4 = new ExtendMeRequired() {
            @Override
            public void doSomeThing() {

            }
        };
        obj4.doSomethingFinal();
        System.out.println(obj4.getClass().getName()); // анонимный класс, а не экземпляр ExtendMeRequired
        System.out.println("_________");
        MySecondExtendedClass obj5 = new MySecondExtendedClass();
        obj5.doSomeThing();
        obj5.doSomethingFinal();

    }
}

abstract class ExtendMeRequired {
    public abstract void doSomeThing();

    public void doSomethingFinal() {
        System.out.println("doSomethingFINAL in Abstract class ExtendMeRequired class");
    }
}

class MySecondExtendedClass extends ExtendMeRequired {

    @Override
    public final void doSomeThing() {
        System.out.println("Implements method of abstract class in MySecondExtendedClass");
    }
}
















