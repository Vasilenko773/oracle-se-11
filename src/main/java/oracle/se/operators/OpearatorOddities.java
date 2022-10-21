package oracle.se.operators;

public class OpearatorOddities {

    public static void main(String[] args) {
        byte b = 1;
        var byt = +b;
        System.out.println(type(byt));

        var negative = -b;
        System.out.println(type(negative));

        short s = 2;
        var ss = s + b;
        System.out.println(type(ss));

        long l = 10L;
        var ll = l + 1.0;
        System.out.println(type(ll)); // Тип данных double
    }

    public static String type(Object type) {
        if (type instanceof Byte) {
            return "byte";
        } else if (type instanceof Short) {
            return "short";
        } else if (type instanceof Integer) {
            return "int";
        } else if (type instanceof Long) {
            return "long";
        } else if (type instanceof Float) {
            return "float";
        } else if (type instanceof Double) {
            return "double";
        }
        return "i dont know";
    }
}
