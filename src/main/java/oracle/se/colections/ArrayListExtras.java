package oracle.se.colections;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExtras {

    @Setter
    public static class BaseClass {
        private String name;

        BaseClass(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        ArrayList<BaseClass> typedList = new ArrayList<>();
        ArrayList rawList = new ArrayList();

        typedList.add(new BaseClass("abc"));
        typedList.add(0, new BaseClass("bcd"));
        typedList.add(0, new BaseClass("cde"));

        for (BaseClass v : typedList) {
            rawList.add(0, new BaseClass(v.toString()));
        }

        System.out.println(typedList);
        System.out.println(rawList);

        typedList.get(2).setName("ccc");

        ((BaseClass) rawList.get(0)).setName("aaa");
        System.out.println("__________");
        System.out.println(typedList);
        System.out.println(rawList);

        System.out.println("__________");
        typedList.add(typedList.size(), new BaseClass("def"));
        System.out.println(typedList);
//        typedList.set(typedList.size(), new BaseClass("def")); // возникает IndexOutOfBoundsException
        // так как интекс выходит за приделы коллекции
//        typedList.add(typedList.size() + 1, new BaseClass("def")); возникает IndexOutOfBoundsException
        System.out.println("_________");
        List<BaseClass> typedSubList = List.of(new BaseClass("efg"), new BaseClass("fgh"), new BaseClass("hij"));
        typedList.addAll(typedList.size(), typedSubList);
        rawList.set(0, typedSubList);
        System.out.println(typedList);
        System.out.println(rawList);

    }
}
