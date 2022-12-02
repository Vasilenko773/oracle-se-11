package oracle.se.part2.genericandcollections.generic;

import lombok.ToString;

import java.util.List;

@ToString
class WildCardTest<T> {
    private int val;

    public WildCardTest() {
    }

    public WildCardTest(int val) {
        this.val = val;
    }

    public static <U> void doSomething(U u) {
        System.out.println(u);
    }

//    public <?> void doSomething() {
//        System.out.println("u");
//    } - ошиюка компиляции.
}

public class WildcardUsage {

    List<?> instanceList;
    List<WildCardTest<?>> tests;
    static List<?> staticList;

    private void setList(List<?> list) {
        instanceList = list;
    }

    private static List<?> getList(List<?> list) {
        return list;
    }

    public static void main(String[] args) {
        WildcardUsage swu = new WildcardUsage();
        List<WildCardTest> wildList = List.of(new WildCardTest(1), new WildCardTest(2));
        List<?> unboundedList = List.of(1, 1.2f, true, false, "yes", new Exception());
        swu.setList(wildList);
        staticList = getList(wildList);
        System.out.println(staticList);
        System.out.println(swu.instanceList);
        System.out.println(unboundedList);
    }
}


