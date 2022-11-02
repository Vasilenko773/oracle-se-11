package oracle.se.polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class GenericCast {

    static class BaseClass {
        String name = "Base class";

        public String toString() {
            return getClass().getName();
        }
    }

    static class NextClass extends BaseClass {
        String name = "Next Class";

        public String toString() {
            return getClass().getName() + " " + name;
        }
    }

    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        List aList;
        aList = rawList;

        ArrayList<BaseClass> baseList = new ArrayList<>();
        List<BaseClass> bList;
        bList = baseList;

        rawList.add(new NextClass());
        baseList.add(new NextClass());

        System.out.println(aList);
        System.out.println(rawList);
        System.out.println(bList);
        System.out.println(baseList);

      /*  rawList.add(new StringBuilder("Hello"));
        baseList.add(new StringBuilder("S")); // ошибка компиляции
        // так как тип данных указан в дженериках

       */
    }
}
