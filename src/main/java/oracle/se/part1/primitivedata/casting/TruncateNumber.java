package oracle.se.part1.primitivedata.casting;

public class TruncateNumber {

    public static void main(String[] args) {
        float f = 126.55f;
        Float fl = new Float(f);
        int i = (int) f;
        System.out.println(i);
        System.out.println(fl.intValue());

        /* Демонстрация кастинга значений с плавающей запятой к целочисленному значению
        * В результате на консоль напечатаеться 126, при этом окрушления не будет*/
    }
}
