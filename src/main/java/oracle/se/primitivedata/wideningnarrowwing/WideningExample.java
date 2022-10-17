package oracle.se.primitivedata.wideningnarrowwing;

public class WideningExample {

    public static void main(String[] args) {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0f;
        double d = 0.0;
        char c = 'a';

        d = f = l = i = s = b;
        /* Цепочки присвоения осуществляються с права на лево.  short = byte, int = short*/
        System.out.println("happy");

        byte bb = 'a';
        /*  char cc = bb;*/
        /* Вызовет ошибку компиляции так как byte изначально пиводиться к int, а сужение типов в java запрещенно (int - char)*/
    }
}
