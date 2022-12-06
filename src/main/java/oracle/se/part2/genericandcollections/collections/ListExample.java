package oracle.se.part2.genericandcollections.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Anne", "Barry", "Charles", "David", "Edward"));
        System.out.println("-------Executing on Collections-----------");
       CollectionTest.doStuffWithCollection(nameList, "Fred", "David", "David");

       List<String> copiedList = List.copyOf(nameList);
        System.out.println(copiedList);
        List newList = new ArrayList(copiedList);
        newList.add("Ralph");
        System.out.println(newList);
        copiedList.add("Ralph");
        System.out.println(copiedList);
    }
}
