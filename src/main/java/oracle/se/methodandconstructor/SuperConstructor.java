package oracle.se.methodandconstructor;


class Parent {
    int x;

    Parent() {
    }
    Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    int f, s, t;

    public Child(int a, int b) {
        f = a;
        s = b;
    }

    public Child(int x) {
        super(x);
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

    }
}
