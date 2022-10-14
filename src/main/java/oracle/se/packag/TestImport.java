package oracle.se.packag;//import oracle.se.test.packag.Import;
//import oracle.se.test.packag.Import;

public class TestImport {

    public static void main(String[] args) {

        System.out.println("печать из тест импорт");
        Import.main(args);
        Import.main(args);
    }
}

class Import {
    public static void main(String[] args) {
        System.out.println("я локальный вложенный класс");
    }
}

