package oracle.se.part2.genericandcollections.generic;

import org.springframework.util.ExceptionTypeFilter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;

class GenericNotBounded<T> {
    T instanceT;

    public GenericNotBounded() {
    }

    public GenericNotBounded(T instanceT) {
        this.instanceT = instanceT;
        System.out.println(this.instanceT.getClass().getName() + " " + instanceT);
    }
}

class GenericClassBound<T extends Number> {
    public int getIntValue(T t) {
        return t.intValue();
    }

    public int getByteValue(T t) {
        return t.byteValue();
    }
}

class GenericInterfaceBound<T extends  Comparable> {
    public void doSomething(T t1, T t2) {
        int comparison = t1.compareTo(t2);
        if (comparison > 0) {
            System.out.println(t2 + " is behind " + t1);
        } else {
            System.out.println(t2 + " is ahead of " + t1);
        }
    }
}

public class TestGenericBounded {

    public static void main(String[] args) {
        GenericNotBounded<Integer> g1 = new GenericNotBounded<>(10);
        GenericNotBounded<Exception> g2 = new GenericNotBounded<>(new Exception());
        GenericClassBound<Byte> c1 = new GenericClassBound<>();
        System.out.println(c1.getIntValue(Byte.parseByte("10")));
        GenericClassBound<Integer> c2 = new GenericClassBound<>();
        System.out.println(c2.getIntValue(128));
        System.out.println(c2.getByteValue(128));

        GenericInterfaceBound<LocalDate> i1 = new GenericInterfaceBound<>();
        i1.doSomething(LocalDate.now(), LocalDate.of(2019, Month.AUGUST, 29));
        GenericInterfaceBound<Float> i2 = new GenericInterfaceBound<>();
        i2.doSomething(12.34f, 12.35f);
        GenericNotBounded<GenericClassBound<Integer>> e = new GenericNotBounded<>();

    }
}

class GeneticMixedBounded<T extends Number & Comparable & Serializable> {

}

