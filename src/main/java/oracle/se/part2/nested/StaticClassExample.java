package oracle.se.part2.nested;

import static oracle.se.part2.nested.EnclosedClass.NestedStaticClass;

public class StaticClassExample {

    public static void main(String[] args) {
        System.out.println(NestedStaticClass.staticName);
        System.out.println(NestedStaticClass.getStaticName());
        System.out.println(NestedStaticClass.Colors.YELLOW);
        EnclosedClass.NestedStaticClass.NestedInterface n;
        System.out.println("_________");
        NestedStaticClass nestedStaticClass = new NestedStaticClass();
        nestedStaticClass.getInstanceName();

    }
}
