package oracle.se.importandpackage;

import static java.lang.Math.*;

public class TestImportStatic {

    public static void main(String[] args) {
        /* Один статический ипорт для статических методов и переменных класса Math
        * Использовать такой импорт не рекомендованно!!!
        * */
        int radius = 2;
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt = sqrt(81);
        System.out.println("sqrt = " + sqrt);
    }
    
    private void importPackageForEachVariable() {
        /* Были объявлены импорты для каждой переменной
        *
        * import static java.lang.Math.PI;
        * import static java.lang.Math.sqrt;
        *
        * */
        int radius = 2;
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt = sqrt(81);
        System.out.println("sqrt = " + sqrt);
    }


    private void notImport() {
        /* Не были добавленны статические импорты совсем*/
        int radius = 2;
        double circumference = 2 * java.lang.Math.PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt = java.lang.Math.sqrt(81);
        System.out.println("sqrt = " + sqrt);
    }
}
