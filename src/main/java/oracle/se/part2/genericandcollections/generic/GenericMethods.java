package oracle.se.part2.genericandcollections.generic;

class Apple implements Comparable<Apple> {
    private int val;

    public Apple(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Apple o) {
        return o.val - this.val;
    }
}

class GreenApple extends Apple {
    GreenApple(int val) {
        super(val);
    }
}

class Orange implements Comparable<Orange> {
    private int val;

    public Orange(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Orange o) {
        return o.val - this.val;
    }
}

public class GenericMethods {

    public int compareObject(Object a, Object b) {
        if (a instanceof  Comparable && b instanceof Comparable) {
            return compareComparables((Comparable) a, (Comparable) b);
        }
        return -1;
    }

    public int compareComparables(Comparable a, Comparable b) {
        if (a instanceof Apple) {
            return ((Apple)a).compareTo((Apple) b);
        } else if (a instanceof Orange) {
            return ((Orange)a).compareTo((Orange) b);
        } else {
            return -1;
        }
    }

    public <T extends Comparable> int compareMatchingTypes(T a, T b) {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        GenericMethods g = new GenericMethods();
        System.out.println("__________");
        System.out.println(g.compareObject(new Apple(1), new Apple(1)) == 0);
        System.out.println(g.<Apple>compareComparables(new Apple(1), new Apple(1)) == 0);
        System.out.println(g.<Apple>compareMatchingTypes(new Apple(1), new Apple(1)) == 0);
        System.out.println("__________");
        System.out.println(g.compareObject(new Apple(1), new GreenApple(1)) == 0);
        System.out.println(g.<Apple>compareComparables(new GreenApple(1), new Apple(1)) == 0);
        System.out.println(g.<Apple>compareMatchingTypes(new GreenApple(1), new Apple(1)) == 0);

        System.out.println(g.compareObject(new Orange(1), new Apple(1)) == 0);
    }



}
