package oracle.se.part1.primitivedata.var;


import oracle.se.part1.primitivedata.var.model.NewClassWithAVeryLongName;

public class VarTest {

    public static void main(String[] args) {
       /* Этот вариант наиболее уродлив и нечетаем
        *
        oracle.se.var.model.NewClassWithAVeryLongName newClassWithAVeryLongName = new oracle.se.var.model.NewClassWithAVeryLongName("first");
        System.out.println(newClassWithAVeryLongName);*/

        /*Второй вариант более читаемы и осуществляеться за счет импорт:
        * import oracle.se.var.model.NewClassWithAVeryLongName;
        *
        NewClassWithAVeryLongName second = new NewClassWithAVeryLongName();*/

        /* Указаный вариант занимает наименьшее место, достигаеться с помощью переменной var и импорта из п. 2*/
        var third = new NewClassWithAVeryLongName();


        var i = 17;
        var array = new int[3];
        var name = third.getName();
        Object nullObject = null;
        var var = nullObject;


    }
}
