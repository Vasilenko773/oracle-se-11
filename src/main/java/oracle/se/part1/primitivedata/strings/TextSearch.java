package oracle.se.part1.primitivedata.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {

    public static void main(String[] args) {
        String full = "testwordtestwordtestword";
        String showIndx = "012345678901234567890123";
        String word = "word";
        int lastIndex = full.lastIndexOf(word);
        System.out.println(lastIndex);

        /*Возвращает индекс вхождения слова в строку в обратном направлении начинаю с указанного индекса */
        lastIndex = full.lastIndexOf(word, 19);
        System.out.println(lastIndex);

        Pattern p = Pattern.compile("(.*)miss(.*)");
        Matcher m = p.matcher("mississippi");
        System.out.println(m.matches());
        System.out.println();
    }
}
