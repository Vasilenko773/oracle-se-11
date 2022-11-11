package oracle.se.part1.polimorfizm;

class Animal {
    public void printAnimal() {
        System.out.println("animal");
    }
}

class Dog extends Animal {

    public void printDog() {
        System.out.println("dog");
    }

    public String getDogString() {
        return "dog";
    }
}

class Cat extends Animal {
    public void printCat() {
        System.out.println("cat");
    }

    public String getCatString() {
        return "cat";
    }
}


public class DowncastExample {

    public static void main(String[] args) {
        DowncastExample dwex = new DowncastExample();
        Animal genericDog = new Dog();
        Animal genericCat = new Cat();

        Dog pug = new Dog();
        Cat specificCat = new Cat();

        dwex.testDog(pug);
        dwex.testCat(specificCat);
        dwex.testAnimal(pug);
        dwex.testAnimal(specificCat);
        dwex.testAnimal(genericCat);
        dwex.testAnimal(genericDog);

        if (((Dog) genericDog).getDogString().equals("dog")) {
            System.out.println("yep, parent casting from child class");
        }

        Cat c = (Cat) dwex.passThrough(genericCat);
        c.getCatString();
        c.printCat();
        /*
        dwex.testDog((Dog) genericCat);
        dwex.testCat((Cat) genericDog);
        dwex.testAnimal((Cat) genericDog);
        dwex.testAnimal((Dog) genericCat);
        При енправильном присвоениитипов будет ошибка компеляции "cannot be cast to class"
         */
    }

    public void testAnimal(Cat cat) {
        System.out.println("test cat");
        cat.printAnimal();
    }

    public void testAnimal(Dog dog) {
        System.out.println("test dog");
        dog.printAnimal();
    }

    public void testAnimal(Animal animal) {
        System.out.println("test animal");
        animal.printAnimal();
    }

    public void testDog(Dog dog) {
        dog.printDog();
    }

    public void testCat(Cat cat) {
        cat.printCat();
    }

    public Object passThrough(Object o) {
        return o;
    }
}
