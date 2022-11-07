package oracle.se.colections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

    public static void main(String[] args) {

        int value = 0;

        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList rawList = new ArrayList(List.of(1, 2, 3, 4 , 5));
        Integer[] intArray = new Integer[10];


        var bInt = intList.toArray(intArray);

        System.out.println(bInt.getClass().getTypeName());

        System.out.println(Arrays.toString(bInt));

        value = bInt[0];
        System.out.println(value);

        var bRaw = rawList.toArray(intArray);
        System.out.println(bRaw.getClass().getTypeName());

        System.out.println(Arrays.toString(bRaw));
        value = (Integer) bRaw[0];
        System.out.println(value);

        intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] cRaw = (Integer[]) rawList.toArray(intArray);
        System.out.println(cRaw.getClass().getTypeName());
        System.out.println(Arrays.toString(cRaw));
        value = cRaw[1];
        System.out.println(value);


        var cInt = intList.toArray(intArray);

        System.out.println(cInt.getClass().getTypeName());

        System.out.println(Arrays.toString(cInt));

        value = cInt[0];
        System.out.println(value);

        Object[] dint = intList.toArray();
//        Integer[] dint = (Integer[]) intList.toArray(); //Возникнет ClassCastExeption
        System.out.println(dint.getClass().getTypeName());
        System.out.println(Arrays.toString(dint));
        System.out.println((Integer)dint[1]);
    }
}
