package oracle.se.part2.exception.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> h = new HashMap<>();
        Map<String, Integer> t = new TreeMap<>();
        Map<String, Integer> l = new LinkedHashMap<>();
        String[] names = new String[] {"Barry", "George", "Harold", "Ida", "John"};

        for (int i = 0; i < names.length; i++) {
            h.put(names[i], i);
            t.put(names[i], i);
            l.put(names[i], i);
        }

        Map<String, Integer> currentMap;
        for (int i = 0; i < 3; i++) {
            if (i == 0) currentMap = l;
            else if (i == 1) currentMap = h;
            else currentMap = t;
            try {
                currentMap.put("NullValue", null);
                currentMap.put(null, 2);
            } catch (Exception e) {
                System.out.println(currentMap.getClass().toGenericString());
                System.out.println(e.toString());
            }
        }
        System.out.println("hashmap " + h);
        h.entrySet().forEach(System.out::println);
        System.out.println("treemap " + t);
        System.out.println("linkedlistmap " + h);
        l.entrySet().forEach(System.out::println);
    }
}
