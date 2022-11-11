package oracle.se.part1.primitivedata.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSpliceAndDice {

    public static void main(String[] args) {
        String[] wordArray = new String[]{"Hello", "word", "How", "are", "you"};
        List<String> words = new ArrayList<>(Arrays.asList(wordArray));
        String sentence = "";
        for (var s : words) {
            sentence += s + " ";
        }
        System.out.println(sentence);

        sentence = String.join(" ", wordArray );
        System.out.println(sentence);
    }
}
