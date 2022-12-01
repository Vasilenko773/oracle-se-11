package oracle.se.part2.genericandcollections.generic;

import java.io.FileNotFoundException;
import java.util.Arrays;

class AnotherGeneric<T, S> {
    T first;
    S second;

    public AnotherGeneric(T first, S second) {
        this.first = first;
        this.second = second;
    }

    String getCommonClass() {
        String[] aClasses = getSuperClassesNotObject(first.getClass());
        String[] bClasses = getSuperClassesNotObject(second.getClass());
        int mismatch = Arrays.<String>mismatch(aClasses, bClasses);
        String val = bClasses[mismatch - 1];
        return val;
    }

    String[] getSuperClassesNotObject(Class c) {
        String name = c.getName();
        String names = "";
        do {
            name = c.getName();
            if (name.length() > 0) names += ",";
            names = name + "." + name;
            c = c.getSuperclass();
        } while (c != null);
        return name.split(",");
    }
}

public class MoreGeneric {

    public static void main(String[] args) {
        ArithmeticException mathBug = new ArithmeticException();
        ClassCastException cast = new ClassCastException();
        FileNotFoundException file = new FileNotFoundException();
        AbstractMethodError error = new AbstractMethodError();

        AnotherGeneric<ArithmeticException, ClassCastException> a = new AnotherGeneric<>(mathBug, cast);
        System.out.println(a.getCommonClass());

        AnotherGeneric<ArithmeticException, FileNotFoundException> b = new AnotherGeneric<>(mathBug, file);
        System.out.println(b.getCommonClass());
        AnotherGeneric<ArithmeticException, AbstractMethodError> c = new AnotherGeneric<>(mathBug, error);
        System.out.println(c);
    }
}
