package oracle.se.part2.exception;

class CustomError extends UnknownError {
    CustomError(String mesage) {
        super(mesage);
    }
}

class CustomAritmethicEcxeption extends ArithmeticException {
    CustomAritmethicEcxeption(String message) {
        super(message);
    }
}

public class UncheckedExample {

    public static void main(String[] args) {
        UncheckedExample uex = new UncheckedExample();
        try {
            System.out.println("--------");
            uex.testCustomError(0);
        } catch (CustomError e) {
            System.out.println(e);
        }
        System.out.println("__________");
        uex.testCustomRuntimeException(0);
    }

    private void testCustomError(int i) {
        try {
            throw new UnknownError();
        } catch (Throwable e) {
            if (i == 0) throw new CustomError("CustomError");
        }
    }

    private void testCustomRuntimeException(int i) {
        try {
            int temp = 10 / i;
        } catch (RuntimeException e) {
            if (i == 0) throw new CustomAritmethicEcxeption("CustomAritmethicEcxeption");
        }
    }
}
