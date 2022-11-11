package oracle.se.part1.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Reference {

    public static void main(String[] args) {
        /*
        * Для получения информации о сборщике мусора, необходимо в VM Option передать: -Xlog:gc*
        * */
        TestClass third = new TestClass();
        TestClass first = new TestClass("first", "first");
        TestClass second = new TestClass("second", "second");
        TestClass four = null;
        TestClass five = null;
        third = first;
        System.out.println(third);
        four = first;
        five = first = second;
        third = first = null;

        System.out.println(third);
        System.out.println(first);
        System.out.println(second);
        System.out.println(four);
        System.out.println(five);


    }


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
   static class TestClass {
        private String a = "a";
        private String b = "b";
    }
}
