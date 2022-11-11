package oracle.se.part1.primitivedata.stringbuilder;

public class StringBuilderExtras {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("ACDC        ");
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
        StringBuilder builder1 = new StringBuilder("sasdasfwe");
        char[] myCharArray = new char[5];
        builder1.getChars(0, 5, myCharArray, 0);
        System.out.println(myCharArray);
    }
}
