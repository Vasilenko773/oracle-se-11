package oracle.se.exception;

import java.io.IOException;

class StaticTest{
    public static String currentMessage;
    public static int currenValue;

    static {
        System.out.println("Initializing class StaticTest");
        try {
            if ((10 / currenValue) > 0) {
                System.out.println("whoops");
            }
        } catch (Exception e) {

        } finally {
            currenValue = 1;
        }
        currentMessage = "inside static Initializer";
    }
}
public class InitialazerException {

    {
        int i = 0;
        if(i == 0) throw new IOException("whoops");
    }

    InitialazerException() throws IOException {

    }

    public static void main(String[] args) {
        System.out.println("main");
      try {
          System.out.println(StaticTest.currentMessage);
      } catch (Exception e) {
          StaticTest.currenValue = 1;
          System.out.println(StaticTest.currentMessage);
      }

        try  {
            InitialazerException ie = new InitialazerException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
