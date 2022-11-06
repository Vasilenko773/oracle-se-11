package oracle.se.interfaceocp;

class GlobalInformation {
    public static int DogCount;
    public static int CatCount;
    public static int ThreeCount;
}

abstract class CounterClass {
    public abstract void countMyInstances();
}

abstract class Animal extends CounterClass {
    private String name;
    public String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        countMyInstances();
    }
}

class Dog extends Animal {
    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.DogCount++;
    }
}

class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.CatCount++;
    }
}

class Three extends Animal {

    public Three(String name, String type) {
        super(name, type);
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.ThreeCount++;
    }
}

public class CompareExample {

    public static void main(String[] args) {
        Dog d;
        Cat c;
        Three t;

        for (int i = 1; i < 6; i++) {
            d = new Dog("dog" + i, "dog");
        }

        for (int i = 1; i < 8; i++) {
            c = new Cat("cat" + i, "cat");
        }

        for (int i = 1; i < 4; i++) {
            t = new Three("tree" + i, "tree");
        }

        System.out.println(GlobalInformation.DogCount + " dog");
        System.out.println(GlobalInformation.CatCount + " cat");
        System.out.println(GlobalInformation.ThreeCount + " three");
    }
}
