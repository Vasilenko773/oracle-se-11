package oracle.se.primitivedata.scope;

public class NestedScope {

    public static void main(String[] args) {
        int i = 10;

        class LocallyDefinedClass {
            {
                System.out.println("locally " + i);
                for (int i = 0; i < 5; i++) {
                    System.out.println("for i " + i);
                }
                System.out.println("______________");
            }

        }
        new LocallyDefinedClass();
        /* При попытке выполнить i++ будет ошибка во вложенном классе.
         Так как локальная переменная используемая во вложенном классе должна быть финализированной*/
        System.out.println(i);
    }

}
