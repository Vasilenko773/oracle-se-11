package oracle.se.part2.genericandcollections.generic;


import java.util.List;

class CombinedClass<T extends Comparable, U> {
    U instanceField;
    Number instanceNumberField;

    <V extends Number> CombinedClass(U instanceField, V instanceNumberField) {
        this.instanceField = instanceField;
        this.instanceNumberField = instanceNumberField;
        System.out.println(instanceField.getClass().getName() + "  " + instanceNumberField.getClass().getName());
    }

    public <X, W extends List<X>> X getComparisonResult(
            T t, T s, W definition) {
        int result = s.compareTo(t);
        if (result != 0) result = result < 0 ? -1 : 1;
        result++;
        return definition.get(result);

    }

}
public class GenericComparison {
    public static void main(String[] args) {
        String s1 = "Anne";
        String s2 = "Bob";
        CombinedClass<String, Byte> c = new CombinedClass<String, Byte>(Byte.valueOf("1"), 2);
        String compareString = c.getComparisonResult(s1, s2, List.of("COME AFTER", "EQUALS", "IS LISTED BEFORE"));
        System.out.println(s1 + " " + compareString + " " + s2);

        CombinedClass<Integer, String> c1 = new CombinedClass<>("asd" /*String Соответвует параметру U*/,  Byte.valueOf("5")/*Byte соотвутсвует параметру V*/);
        Integer i1 = 1;
        Integer i2 = 5;
        String comparisonResult = c1.getComparisonResult(i1, i2, List.of("COME AFTER", "EQUALS", "IS LISTED BEFORE"));
        System.out.println(i1 + " " + comparisonResult + " " + i2);
    }
}
