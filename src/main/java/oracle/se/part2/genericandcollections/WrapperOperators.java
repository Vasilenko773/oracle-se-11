package oracle.se.part2.genericandcollections;

public class WrapperOperators {

    public static void main(String[] args) {
        Integer i = 10;
        short j = 10;

        int res = i + j;
        Integer resi = i + j;

        var resva = i + j;
        System.out.println(res);
        System.out.println(resi);
        System.out.println(resva);


    }
}
