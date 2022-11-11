package oracle.se.part1.incapsulation;

 class PackageAClass{

    public void testClass() {
        SuperClass s = new SuperClass();
        System.out.println("void testClass PackageAClass");
        System.out.println(s.publicInt);
        System.out.println(s.packageInt);
        System.out.println(s.protectedInt);
    }
}

public class SuperClass {
    public int publicInt = 10;
    int packageInt = 20;
    protected int protectedInt = 30;
    private int privateInt = 40;

    public static void main(String[] args) {
        new SuperClass().testClass();
        new PackageAClass().testClass();
    }

    public void testClass(){
        System.out.println("void Superclass");
        System.out.println(this.publicInt);
        System.out.println(this.packageInt);
        System.out.println(this.protectedInt);
        System.out.println(this.privateInt);
    }
}
