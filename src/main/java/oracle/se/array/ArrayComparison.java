package oracle.se.array;

import java.util.Arrays;
import java.util.List;

public class ArrayComparison {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] copyArray = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] arrayUnsorted = {"b", "a", "e", "h", "c", "g", "f", "d"};

        String[] firstArray = array;
        List<String> fList = Arrays.asList(array);
        List<String> sList = Arrays.asList(copyArray);
        List<String> tList = Arrays.asList(arrayUnsorted);
        System.out.println("Equals");
        System.out.println(array.equals(copyArray)); //false - так как разные ссылки на массив хоть и одинковые даныне
        System.out.println(array.equals(firstArray)); // true

        System.out.println("Arrays.Equals");
        System.out.println(Arrays.equals(array, copyArray)); // true
        System.out.println(Arrays.equals(array, firstArray)); // true

        System.out.println("Arrays.Compare");
        System.out.println(Arrays.compare(array, copyArray)); //0
        System.out.println(Arrays.compare(array, firstArray)); // 0
        System.out.println(Arrays.compare(array, arrayUnsorted)); // -1

        System.out.println("Equals List");
        System.out.println(fList.equals(sList)); // true при сравнении коллекция сравниваються элементы коллекции
        System.out.println(fList.equals(tList)); // false
    }
}
