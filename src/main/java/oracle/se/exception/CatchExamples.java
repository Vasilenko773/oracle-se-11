package oracle.se.exception;

import java.io.IOException;

class CustomThrowable extends Throwable {
    CustomThrowable(String message) {
        super(message);
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class SuperClass {
    public void methodSuperClass() throws CustomException {
    }
}

class SubClass extends SuperClass {
    public void methodSubClass() {
        try {
            methodSuperClass();
        } catch (Exception CustomException) {
        }
    }
}

public class CatchExamples {
    public static void main(String[] args) {
        CatchExamples ce = new CatchExamples();
//        try {
//
//        } catch (CustomThrowable e) {
//            // Ошибка компилятор так как отсутствует метод в блоке try который выбрасывает CustomThrowableException c помощью throws
//
//        }
//        try {
//            SubClass c = new SubClass();
//            c.methodSuperClass();
//        } catch (CustomException e) {
//
//        }
//        try {
//
//        } catch (Error e) {
//
//        }
//        try {
//
//        } catch (RuntimeException e) {
//
//        }
//    }
// ДЕМОНСТРАЦИЯ ПЕРЕХВАТА НЕСКОЛЬКИХ ИСКЛЮЧЕНИЙ (НЕ ДОЛЖНЫ ЯВЛЯТЬСЯ ПОТОМКАМИ)
        try {
            SubClass c = new SubClass();
            c.methodSuperClass();
            ce.testError();
        } catch (ArithmeticException e) {
            e = new ArithmeticException("sasd");
            throw e;
        } catch (CustomException | RuntimeException | IOException e) {
            throw new RuntimeException("many exception");
        }

    }

    private void testError() throws IOException {

    }


}
