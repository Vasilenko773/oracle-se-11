package oracle.se.part1.operators;

public class IfElse {

    public static void main(String[] args) {
        boolean flag = false;
        boolean subFlag = true;
        if (flag) ;
        else System.out.println("flag is false");


        if (flag) // компилятор не считывает следующий if так как прорущена ;
            if (subFlag) System.out.println("SubFlag is true");
        else System.out.println("Subflag false");
        else System.out.println("flag is false");

        System.out.println("__________");
        flag = false;
        if (flag = true) {
            System.out.println("Flag true");
        } else {
            System.out.println("Flag false");
        }
    }
}
