package oracle.se.part1.exception;

public class TrowsExample {

    class ACustomRuntimeException extends RuntimeException {
        ACustomRuntimeException(String message) {
            super(message);
        }
    }

    class ACustomCheckedException extends Exception {
        ACustomCheckedException(String message) {
            super(message);
        }
    }

    class ACustomThrowable extends Throwable {
        ACustomThrowable(String message) {
            super(message);
        }
    }

    class AError extends Error {
        AError(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        TrowsExample te = new TrowsExample();

        for (int i = 0; i < 4; i++) {
            try {
                switch (i) {
                    case 0:
                        te.methodOne();
                        break;
                    case 1:
                        te.methodTwo();
                        break;
                    case 2:
                        te.methodThree();
                        break;
                    case 3:
                        te.methodFour();
                        break;
                }
            } catch (ACustomRuntimeException are) {
                System.out.println("catch int main ACustomRuntimeException " + are);
            } catch (RuntimeException e) {
                System.out.println("catch in main" + e);
            } catch (ACustomThrowable th) {
                System.out.println("catch int main ACustomThrowable" + th);
            } catch (AError ae) {
                System.out.println("catch int main AError " + ae);

            }
        }
    }

    private void methodOne() {
        throw new ACustomRuntimeException("method one");
    }

    private void methodTwo() {
        try {
            throw new ACustomCheckedException("method two");
        } catch (Exception e) {
            System.out.println("catch in method two" + e);
            throw new ACustomRuntimeException("catch method two ACustomRuntimeException");
        }
    }

    private void methodThree() throws ACustomThrowable {
        throw new ACustomThrowable("method three");
    }

    private void methodFour() {
        throw new AError("method four");
    }
}

