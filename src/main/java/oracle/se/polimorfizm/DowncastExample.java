package oracle.se.polimorfizm;

class Animal {
    public void printAnimal() {
        System.out.println("animal");
    }
}

class Dog extends Animal {

    public void printDog() {
        System.out.println("dog") ;
    }
}

class Cat extends Animal {
    public void printCat() {
        System.out.println("cat") ;
    }
}



public class DowncastExample {

    public static void main(String[] args) {
        DowncastExample dwex = new DowncastExample();
        Animal dog = new Dog();
        Animal cat = new Cat();

        Dog pug = new Dog();
        Cat specificCat = new Cat();

        dwex.testDog(pug);
        dwex.testCat(specificCat);
        dwex.testAnimal(pug);
        dwex.testAnimal(specificCat);
        dwex.testAnimal(cat);
        dwex.testAnimal(dog);
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
}
