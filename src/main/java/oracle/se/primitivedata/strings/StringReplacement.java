package oracle.se.primitivedata.strings;

public class StringReplacement {

    public static void main(String[] args) {

        String mississippi = "mississippi";
        String replace = mississippi.replace('s', 'S');
        System.out.println(replace);

        System.out.println(mississippi.substring(7));
        System.out.println(mississippi);
    }
}
