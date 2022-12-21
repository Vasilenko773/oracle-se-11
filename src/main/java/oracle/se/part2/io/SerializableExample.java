
package oracle.se.part2.io;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;

@AllArgsConstructor
class Animal {
    int age;
    int weight;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }
}

class Pet extends Animal implements Externalizable {
    private String name;
    private String type;
    private transient boolean breed = true;
    static int count;

    public Pet() {
    }

    public Pet(String name, String type) {
        super(1);
        this.name = name;
        this.type = type;
    }

    public Pet(int age, String name, boolean breed) {
        super(age);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt();
    }
}

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pet original = new Pet("Brandy", "Dog");
        original.age = 5;
        original.weight = 12;
        Pet.count = 25;
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
