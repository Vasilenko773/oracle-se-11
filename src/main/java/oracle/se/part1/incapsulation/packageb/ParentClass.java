package oracle.se.part1.incapsulation.packageb;


import oracle.se.part1.incapsulation.SuperClass;

class PackageBClass{


    void testClass() {
        SuperClass s = new SuperClass();
        System.out.println("PackageBClass");
        System.out.println(s.publicInt);
    }
}

public class ParentClass extends SuperClass {


    public void testClass() {
        System.out.println(this.getClass().getName());
        System.out.println(this.protectedInt);
        System.out.println(this.publicInt);
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        new PackageBClass().testClass();
        new SuperClass().testClass();
        new ParentClass().testClass();


    }
}
