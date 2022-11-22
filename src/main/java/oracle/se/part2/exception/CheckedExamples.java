package oracle.se.part2.exception;

class CustomException extends Exception {
    private static final int ERROR_CODE = 9876;

    CustomException(String message, Throwable cause, boolean writableStackTree) {
        super(message + " " + ERROR_CODE, cause, false, writableStackTree);
    }
}

class CustomThrowable extends Throwable {
    private static final int ERROR_CODE = 1234;

    CustomThrowable() {
    }

    CustomThrowable(String message) {
        System.out.println(message + " " + ERROR_CODE);
    }

    CustomThrowable(String message, Throwable throwable) {
        super(message + " " + ERROR_CODE, throwable);
        doSomethingSpecial();
    }

    void doSomethingSpecial() {
        System.out.println("First send alert");
    }
}

public class CheckedExamples {

    public static void main(String[] args) throws Throwable {
        CheckedExamples cex = new CheckedExamples();
        System.out.println("____________");
        cex.hendleThrowable();
        try {
            System.out.println("Custom exception");
//            cex.throwThrowable(0);
//        } catch (CustomThrowable c) {
//            c.printStackTrace(System.out);
//        }
            cex.tetsExceptionNotHandled(0);
        } catch (CustomException c) {
            c.printStackTrace(System.out);
        }
        System.out.println("main after catch");
        cex.throwThrowable(1);
    }


    private void throwThrowable(int i) throws CustomThrowable {
        try {
            throw new IllegalStateException("whoops, this is bad");
        } catch (Exception e) {
            if (i == 0) throw new CustomThrowable("Cathc block");
        }
        if (i == 1) throw new CustomThrowable("affter catch block");
    }

    private void hendleThrowable() {
        try {
            throw new CustomThrowable();
        } catch (CustomThrowable c) {
            c.printStackTrace(System.out);
        }
    }

    private void tetsExceptionNotHandled(int i) throws CustomException {
        try {
            throw new IllegalStateException("bug");
        } catch (Exception e) {
            if (i == 0) throw new CustomException("Custom Exception", e, false);
            else throw new CustomException("Custom Exception", e, true);
        }
    }
}
