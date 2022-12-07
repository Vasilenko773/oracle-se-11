package oracle.se.part2.genericandcollections.collections;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@AllArgsConstructor
@Data
class ThreeElement implements Comparable<ThreeElement>, Comparator<ThreeElement> {
    private int id;
    private String value;


    @Override
    public int compareTo(ThreeElement o) {
        return this.id - o.id;
    }

    @Override
    public int compare(ThreeElement o1, ThreeElement o2) {
        return o2.value.compareToIgnoreCase(o1.value);
    }
}

public class ThreeExamples {

    public static void main(String[] args) {
        List<ThreeElement> setTestData = List.of(
                new ThreeElement(2, "Sam"),
                new ThreeElement(5, "Carol"),
                new ThreeElement(1, "Mary"),
                new ThreeElement(10, "Tim"));

        TreeSet<ThreeElement> treeSet = new TreeSet<>(Comparator.comparing(i -> i.getValue().length()));
        treeSet.addAll(setTestData);
        System.out.println("Test value");
        treeSet.forEach(System.out::println);
        System.out.println("---- Element lower than Sam ----");
        System.out.println(treeSet.lower(setTestData.get(0)));

    }
}
