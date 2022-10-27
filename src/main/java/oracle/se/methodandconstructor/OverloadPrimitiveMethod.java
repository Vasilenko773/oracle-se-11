package oracle.se.methodandconstructor;

public class OverloadPrimitiveMethod {

    public static void main(String[] args) {
        OverloadPrimitiveMethod o = new OverloadPrimitiveMethod();
        o.bestMethod((byte) 1);
        o.bestMethod('c');
        o.bestMethod(10L);
        o.bestMethod(10.00);
        o.bestMethod(Byte.valueOf((byte) 1));

    }

    private void bestMethod(byte b) {
        System.out.println("byte");
    }

    private void bestMethod(char c) {
        System.out.println(c);
    }

    private void bestMethod(long l) {
        System.out.println(l);
    }

    private void bestMethod(double d) {
        System.out.println(d);
    }
}
