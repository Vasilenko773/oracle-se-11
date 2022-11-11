package oracle.se.part1.polimorfizm;

import java.util.Arrays;

class MostBasicClass {

    public void baseMethod() {
        System.out.println("Parent base method");
    }

    public Object baseMethod(String s) {
        System.out.println("Parent overload base method");
        return s;
    }

    public int baseMethod(int... intArray) throws ArrayIndexOutOfBoundsException {
        System.out.println("Parent overload method");
        return intArray[intArray.length + 1];
    }
}


public class OverrideOverload extends MostBasicClass {

    public void baseMethod() {
        super.baseMethod();
        System.out.println("child base method");
    }

    public Object baseMethod(String[] s) {
        System.out.println("child string array");
        return Arrays.toString(s);
    }

    public Integer baseMethod(String s) {
        System.out.println("child string");
        return 1;
    }

    public int baseMethod(int[] intArray) {
        System.out.println("Parent overload method");
        return intArray[intArray.length - 1];
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        OverrideOverload ov = new OverrideOverload();
        int i = 0;
        ov.baseMethod();
        ov.baseMethod("os");
        try {
            i = ov.baseMethod(array);
        } catch (Exception e) {
            System.out.println("Exeption");
        }
        System.out.println(i);

    }
}
