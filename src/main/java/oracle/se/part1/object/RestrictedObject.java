package oracle.se.part1.object;

import lombok.Getter;

@Getter
class OnlyClass {

//    private OnlyClass() {
//    }

    private int intVariable;

    private static final OnlyClass instance = new OnlyClass();

    public OnlyClass getInstance() {
        return instance;
    }

    public static void doSomething() {
        instance.doSomethingRestricted();
    }

    private void doSomethingRestricted() {
        this.intVariable++;
        System.out.println("Only one instance");
        OnlyClass o = new OnlyClass();
    }

}

public class RestrictedObject {

    public static void main(String[] args) {
        OnlyClass.doSomething();
        OnlyClass o = new OnlyClass(); //- у суперкласса отсутствует конструктор по умолчанию
    }
}

//class MyOnlyClass extends OnlyClass{ //нельзя наследоваться от класса у которого отсутсвует конструктор по умолчанию
////(Если конструктор приватный)
//}
