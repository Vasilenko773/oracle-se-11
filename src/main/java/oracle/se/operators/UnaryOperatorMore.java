package oracle.se.operators;

public class UnaryOperatorMore {

    public static void main(String[] args) {
        int a = 1, b = -a;
        System.out.println(a+" " + b); //1  -1
        a = -1;
        b = -a; //+1
        System.out.println(a+" " + b);

        a = 1;
        b = +a;//1
        System.out.println(a+" " + b);
        a = -1;
        b = +a;//-1
        System.out.println(a+" " + b);

        int bin1 = 0b00000000_00010000_00000000_00000000;
        int bin2 = ~bin1;
        System.out.println(Integer.toBinaryString(bin2));
    }
}
