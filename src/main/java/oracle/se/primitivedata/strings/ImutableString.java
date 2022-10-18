package oracle.se.primitivedata.strings;

public class ImutableString {

    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1 + " World"; // это не изменяет значение в пуле строк. В Стеке будет создана новое значение Hello World
        // и ссылка будет передана в s1
        System.out.println(s1);
        s1 = "Hello";
        s1.concat(" World"); // метод создаст новую неизменяемую строку в пуле строк,
        // но не присваевает ссылку не какой переменной
        System.out.println(s1);
    }
}
