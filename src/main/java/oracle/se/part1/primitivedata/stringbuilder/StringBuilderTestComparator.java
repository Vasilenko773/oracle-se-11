package oracle.se.part1.primitivedata.stringbuilder;

public class StringBuilderTestComparator {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));
        System.out.println(sb.compareTo(sb1));
        System.out.println(sb.toString().equals(sb1.toString()));
    }
}
