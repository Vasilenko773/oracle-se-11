package oracle.se.importandpackage;

/*import java.lang.Number;
*
* В СЛУЧАЕ УКАЗАНИЯ ДАННОГО ИМПОРТА ВОЗНИКНЕТ ОШИБКА КОМПИЛЯЦИИ
*  ТАК КАК JAVA НЕ СМОЖЕТ ПОНЯТЬ ЭКЗЕМПЛЯР КАКОГО КЛАССА ИСПОЛЬЗОВАТЬ
* */

public class Number {

    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number numberj) {
        this.numberj = numberj;
        System.out.println("Создание oracle.se.packag.Number с помощью java.lang.Number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Создание oracle.se.packag.Number с помощью oracle.se.packag.Number");
    }

    public static void main(String[] args) {
        /* Создаеться 2 экземрляра класса oracle.se.packag.Number*/
        Number n = new Number(10);
        Number n2 = new Number(n);

    }
}
