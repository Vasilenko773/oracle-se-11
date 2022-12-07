package oracle.se.part2.genericandcollections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Anne", "Barry", "Charley", "David", "Edward"));

        System.out.println("Initial list : " + nameList);
        Collections.swap(nameList, 0, nameList.size() - 1);
        System.out.println("After swapping " + nameList);

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(nameList);
            System.out.println("After shuffle " + nameList);
        }
        Collections.reverse(nameList);
        System.out.println("After reverse " + nameList);


        Collections.fill(nameList, "Unknown");
        System.out.println("After filling " + nameList);
    }
}
