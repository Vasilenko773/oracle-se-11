package oracle.se.part2.exception.assertion;

public class AssertionExample {

    static {
        boolean startUpAllowed = false;
        assert  startUpAllowed = true;
        if (!startUpAllowed) {
            throw new RuntimeException("Assertion must be enabled!!!");
        }
    }

    enum assertFlags {
        BYTE_OUT_OF_RANGE("Value is out of range fot a byte");

        private String message;

        assertFlags(String message) {
            this.message = message;
        }
    }

    public static String getAssertMessage(assertFlags artFlag) {
        return "Method returns  " + artFlag.message;
    }

    public static void voidAssertMessage(assertFlags artFlag) {
        System.out.println("Method returns  " + artFlag.message);
    }

    public static void main(String[] args) {
        byte s2;
        short maxValue = Byte.MAX_VALUE + 1;
        assert maxValue >= Byte.MIN_VALUE && maxValue <= Byte.MAX_VALUE :
        getAssertMessage(assertFlags.BYTE_OUT_OF_RANGE);
       // voidAssertMessage(assertFlags.BYTE_OUT_OF_RANGE); - метод в утвержжении 2 не работает так как он void

        s2 = (byte) maxValue;
        System.out.println("short value = " + maxValue );

        System.out.println("byte value = " + s2);
    }
}
