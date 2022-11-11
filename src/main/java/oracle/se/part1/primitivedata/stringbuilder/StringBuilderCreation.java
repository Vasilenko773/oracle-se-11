package oracle.se.part1.primitivedata.stringbuilder;

public class StringBuilderCreation {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
    }
}
