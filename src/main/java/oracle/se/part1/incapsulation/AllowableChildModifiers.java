package oracle.se.part1.incapsulation;

import lombok.Getter;

@Getter
class Animal {

    public String name = "public";
    protected String breed = "protected";
    String owner = "default";
    private String type = "private";

    @Override
    public String toString() {
        return name + " " + breed + " " + owner + " " + type;
    }
}

class Dog extends Animal {

    private String name;
    String breed;
    protected String owner;
    public String type = "Dog";

    public Dog(String owner, String name, String breed) {
     this.owner = owner;
     this.name = name;
     this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class AllowableChildModifiers {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a);
        System.out.println("_________");
        Dog pug = new Dog("Fran", "Brandy", "Pug");
        System.out.println(pug);
        System.out.println(pug.type + " type");
        System.out.println(pug.breed + " breed");
        System.out.println(pug.owner + " owner");

        System.out.println("_________");
        a = pug;
        System.out.println(a.breed);
        System.out.println(a.name);
        System.out.println(a.owner);
        System.out.println(a.getType());
    }
}
