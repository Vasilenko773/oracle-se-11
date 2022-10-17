package oracle.se.primitivedata.casting;

public class UnsignedExample {


    public static void main(String[] args) {
        int i = Integer.MAX_VALUE + 3;
        System.out.println(i);

        long l = (long) Integer.MAX_VALUE + 3;
        System.out.println(l);

        String str = Integer.toUnsignedString(i);
        System.out.println(str);



    }


}
