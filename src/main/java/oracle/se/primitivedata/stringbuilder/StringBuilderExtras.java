package oracle.se.primitivedata.stringbuilder;

public class StringBuilderExtras {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("   ACDC        ");
        System.out.println(builder + "*");
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        builder.trimToSize();
        System.out.println(builder + "*");
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        builder.replace(0, builder.length(), builder.toString().strip());
        System.out.println(builder + "*");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
    }
}
