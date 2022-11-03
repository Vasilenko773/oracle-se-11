package oracle.se.polimorfizm;

class SubClass {
    public static String classyName = "abc";
    public static String getClassyName() { return classyName; }
}

public class Test extends SubClass {
    public static String classyName = "def";
    public static String getClassyName() { return classyName; }

    public static void main(String[] args) {
        Test tt = new Test();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;
        System.out.println(s.getClass().getName()); // Object s относиться к объекту SubClass
        SubClass subClass = new SubClass();
        Test test = (Test) subClass; // Ошибка компеляции. Так как Subclass не является подтипом Test

        int tempcount = ((Test) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName((Test) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;

        System.out.println("abcCount = " + abcCount);

        Object ob = new Object();
    }

    public String getClassyName(Object t) {
        Test tt = (Test) t; // Ошибка компилятора на этом месте.
        return tt.getClassyName();
    }

    public String getClassyName(SubClass sc) {
        return sc.getClassyName();
    }
}