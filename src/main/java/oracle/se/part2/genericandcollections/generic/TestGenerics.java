package oracle.se.part2.genericandcollections.generic;

class SpecificallyTypedClass {
    Object currentObj;

    SpecificallyTypedClass(Object o) {
        this.currentObj = o;
        printType();
    }

    public void printType() {
        System.out.println(this.currentObj.getClass().getName());
    }
}

class GenericTypeClass<T> {
    T currentObj;

    GenericTypeClass(T t) {
        this.currentObj = t;
        printType();
    }

    public void printType() {
        System.out.println(this.currentObj.getClass().getName());
    }
}

public class TestGenerics {

    public static void main(String[] args) {
        SpecificallyTypedClass raw1 = new SpecificallyTypedClass("hello");
        SpecificallyTypedClass raw2 = new SpecificallyTypedClass(new StringBuilder("hello"));
        SpecificallyTypedClass raw3 = new SpecificallyTypedClass(10);
        GenericTypeClass<String> g1 = new GenericTypeClass<>("Hello");
        GenericTypeClass<StringBuilder> g2 = new GenericTypeClass<>(new StringBuilder("Hello"));
        var g3 = new GenericTypeClass<Integer>(10);

        Object o = raw1.currentObj;
//        StringBuilder s1 = (StringBuilder) o; ClassCastException так как нельзя строку преобразовать в StringBuilder
        String s2 = g1.currentObj;
    }
}
