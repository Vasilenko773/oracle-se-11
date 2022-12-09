package oracle.se.part2.interfaces.functionInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

interface Cinfusavle<String> extends Comparator<String> {
    default int compare(String s1, String s2) {
        System.out.println("compare");
        Random r = new Random();
        int i = r.nextInt();
        if (i % 2 == 0) i = -i;
        return i;
    }

    int dummy(String sq, String s2);
}
@Data
@AllArgsConstructor
class Confused<T> implements Cinfusavle<String> {
    private String name;

    public int dummy(String sq, String s2) {
        return 0;
    }

}

public class LambdaExtrass {

    public static void main(String[] args) {
        Comparator c = (s, t) -> {
            System.out.println("method");
            return -1;
        };
        List<Confused> list = new ArrayList<>();
        list.add(new Confused("Petr"));
        list.add(new Confused("Bob"));
        list.add(new Confused("Charlz"));
        Collections.sort(list, c);
        System.out.println(list);
    }
}
