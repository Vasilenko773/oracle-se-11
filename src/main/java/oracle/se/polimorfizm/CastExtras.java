package oracle.se.polimorfizm;

import lombok.ToString;

import java.util.Arrays;

public class CastExtras {

    static class BaseClass {

        String name = "Base Class";

        @Override
        public String toString() {
            return getClass().getName();
        }
    }

    static class NextClass extends BaseClass {
        String name = "Next Base Class";
    }

    public static void main(String[] args) {
        Object[] myObjectArray = new Object[10];

        Arrays.fill(myObjectArray, new NextClass());

        myObjectArray[5] = new StringBuilder("test");

        System.out.println(myObjectArray.getClass().getTypeName());
        System.out.println(Arrays.toString(myObjectArray));


        try {
            for (Object o : myObjectArray) {
                NextClass n = (NextClass) o;
                System.out.println(n.name);

                BaseClass b = (BaseClass) o;
                System.out.println(b.name);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


        BaseClass baseArray[] = new BaseClass[6];
        Arrays.fill(baseArray, 0, 3, new BaseClass());
        Arrays.fill(baseArray, 3, 6, new NextClass());

        System.out.println(Arrays.toString(baseArray));

        for (BaseClass n : baseArray) {
            System.out.println(n + " : " + ((n instanceof NextClass)
                    ? ((NextClass)n).name : n.name));
        }

       /* NextClass [] nextClassArry = (NextClass[]) baseArray;
        System.out.println(Arrays.toString(nextClassArry));
        Блок кода приводит к exception " cannot be cast to class"
        */

      /*  Arrays.fill(baseArray, new NextClass());
        NextClass[] nextArray = (NextClass[]) baseArray;
        System.out.println(Arrays.toString(nextArray));
        Аналогичная ошибка при попытке вызвать кастинг родительского массива к классу наследнику - "cannot be cast to class"
       */
    }
}
