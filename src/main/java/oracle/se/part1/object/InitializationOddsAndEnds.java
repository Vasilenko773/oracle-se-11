package oracle.se.part1.object;

import lombok.Setter;
import lombok.ToString;

public class InitializationOddsAndEnds {

    public static void main(String[] args) {
        ASubClass subClass = new ASubClass("Joe");
        System.out.println(subClass);
    }

    @Setter
    @ToString
    static class ASuperClass {

        String name;

        ASuperClass() {
            System.out.println("Parent Constructor");
        }
    }

    static class ASubClass extends ASuperClass {
        ASubClass() {
            System.out.println("Child Constrictor");
            setName(name);
        }

        ASubClass(String name) {
            this();
            System.out.println("Child Argument Constructor");
            setName(name);
        }

        {
            this.name = "Ovveride";
            System.out.println("Cgild block initialization");
            System.out.println(this);
        }

       static  {
            System.out.println("Static block initialization");
        }
    }
}
