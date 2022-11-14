package oracle.se.part2.nested;

import lombok.Getter;

public class EnclosedClass {

    public String outerName = "outer";
    public static String staticOuterName = "OUTER";

    public static void doSomethingStatically() {
        System.out.println("STATIC EnclosedClass");
        NestedStaticClass.getStaticName();
    }

    public void doSomethingOnInstance() {
        System.out.println("not other modifier EnclosedClass");
       new NestedStaticClass().getInstanceName();
    }
    @Getter
    public static class NestedStaticClass{
        public static String staticName ="Nested static class static name";

        public String instanceName = "Nested static class instance name";

        public static String getStaticName() {
            return staticName;
        }

        public String getInstanceName() {
            return this.instanceName;
        }

        public enum Colors {
            RED, BLUE, YELLOW
        }

        public interface NestedInterface {
        }
    }

    public static void main(String[] args) {
        System.out.println(NestedStaticClass.staticName);
        System.out.println(EnclosedClass.NestedStaticClass.getStaticName());
        System.out.println(NestedStaticClass.Colors.BLUE);
       NestedStaticClass.NestedInterface n;
    }
}
