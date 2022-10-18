package oracle.se.primitivedata.scope;

import lombok.Setter;
import lombok.ToString;

@Setter
public class Person {

    static String name = "UNKNOWN";
    String name1 = "UNKNOWN";
    String age = "25";

    public Person() {

    }

    public Person(String age) {
        age = age;
    }

    public Person(String name1, String age) {
        this.name1 = Person.name = name1;
        this.age = age;
    }

    @Override
    public String toString() {
        return name1 + " is " + age + " " + name + "years group : " + getAgeGroupClassification();
    }

    public String getAgeGroupClassification() {
        int age = Integer.parseInt(this.age);
        if (age > 95) {
            return "старый";
        } else if (age > 50) {
            return "пристарелый";
        } else if (age > 20) {
            return "молодой";
        }
        return "юнный";
    }
}
