package oracle.se.part2.exception.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSetExamples {
    public static void main(String[] args) {
        Map<String, Integer> t = new TreeMap<>(Map.of(
                "Mary", 10,
                "John", 20,
                "Ralph", 30,
                "George", 15,
                "Kate", 50));
        System.out.println("Initial value: " + t);
        Set entrySet = t.entrySet();
        entrySet.remove("John");
        System.out.println(t);

        entrySet.remove(Map.entry("John", 25));
        System.out.println(t);
        entrySet.remove(Map.entry("John", 20));
        System.out.println(t);

        Collection<Integer> values = t.values();
        values.remove(50);
        System.out.println(t);

        Collection<String> keySet = t.keySet();
        keySet.remove("Mary");
        System.out.println(t);
        t.putAll(Map.of(
                "Carol", 5,
                "Martha", 46,
                "Mark", 33
        ));
        System.out.println(t);
        System.out.println(t.size());
        keySet.retainAll(Set.of("Carol", "Kate", "Mary", "Andrew"));
        System.out.println(t);
    }
}
