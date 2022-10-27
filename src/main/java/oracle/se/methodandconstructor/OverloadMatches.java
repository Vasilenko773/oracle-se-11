package oracle.se.methodandconstructor;

class WithOne {
    public String isOne(Integer i) {
        return "Integer";
    }

    public String isOne(short i) {
        return "short";
    }

//    public String isOne(int i) {
//        return "int";
//    }

    public String isOne(long i) {
        return "long";
    }

    public String isOne(char... i) {
        return "chars";
    }
}

public class OverloadMatches {

    public static void main(String[] args) {
        WithOne withOne = new WithOne();
        char c = 'a';
        System.out.println(withOne.isOne(c) + " " + c); // char преобразуется до int но учитывая что нет
        // метода перегруженного int тип данных расширяется до long
    }
}
