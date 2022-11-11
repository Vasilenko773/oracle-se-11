package oracle.se.part1.importandpackage;

import oracle.se.part1.importandpackage.a.StaticImportTest1;
import oracle.se.part1.importandpackage.b.StaticImportTest2;

/*import static oracle.se.packag.b.StaticImportTest2.APP_NAME;

ПРИ ЯВНОМ УКАЗАНИИ СТАТИЧЕСКОЙ ПЕРЕМЕННОЙ БУДЕТ ОТРАБАТЫВАТЬСЯ
 ПЕРЕМЕННАЯ ИМПОРТИРУЕМОГО ИСПОРТИРУЕМЫЙ КЛАСС
*/
public class TestStatic {

    public static void main(String[] args) {
        /*
        * МЕТОДЫ ВСЕХ КЛАССОВ ВЫПОЛНЯЮТЬСЯ БЕЗ ОШИБКИ ПРИ СЛЕДУЮЩИХ ИПОРТАХ:
        * import oracle.se.packag.a.StaticImportTest1;
        * import static oracle.se.packag.a.StaticImportTest1.*;
        * import oracle.se.packag.b.StaticImportTest2;
        *  */
        System.out.println("APP_NAME = " + StaticImportTest1.APP_NAME);
        StaticImportTest1.log("This is StaticImportTest");
        new StaticImportTest1().uniqueStatement();

        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);
        StaticImportTest2.log("This is StaticImportTest2");
        new StaticImportTest2().uniqueStatement();
    }
}
