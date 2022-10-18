package oracle.se.var;

public class VarDonts {

   /*Нельзя объявлять статические поля и иные поля с помощью var.
   С помощью var объявляються только локальные переменные.

    static var str = "DONT";
    private var dont = 10;*/

    public static void main(String[] args) {
          /* Недопустимое нициализация var
        var[] newarray = new int[];
        var j = 0, k = 10;
        var sumObject;
        var newVar = null
        var myarray = {10, 15, 16};
        */
    }

 /*Нельзя использовать var в качестве возвращаемого значения
    public static var myVars(String[] args) {
        return args;
    }*/

    /*  Нельзя использовать var в качестве аргументов методов
    public static String[] myVarsArray(var args) {
        return args;
    }*/
}
