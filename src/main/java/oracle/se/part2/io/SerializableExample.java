
package oracle.se.part2.io;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;

@AllArgsConstructor
@NoArgsConstructor
class Animal{
     int age;
     int weight;

    public Animal(int age) {
        this.age = age;
    }
}
class Pet extends Animal implements Serializable {
    private String name;
    private String type;
    private transient boolean breed = true;

    public Pet(String name, String type) {
        super(1);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pet original = new Pet("Brandy", "Dog");
        original.age = 5;
        original.weight = 12;
        System.out.println("-------Original State-----------");
        System.out.println(original);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Brandy.ser"))) {
            out.writeObject(original);
        }
        Pet desirializable = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Brandy.ser"))) {
            desirializable = (Pet) in.readObject();
        } catch (EOFException e) {
        }
        System.out.println("--------Deserializable state --------");
        System.out.println(desirializable);
    }
}
