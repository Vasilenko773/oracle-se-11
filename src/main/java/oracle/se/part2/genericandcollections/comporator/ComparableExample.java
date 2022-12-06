package oracle.se.part2.genericandcollections.comporator;

import lombok.ToString;

import java.util.Set;
import java.util.TreeSet;

@ToString
class SmartDog implements Comparable<SmartDog> {

    private DogType dogType;

    public SmartDog(DogType dogType) {
        this.dogType = dogType;
    }

    @Override
    public int compareTo(SmartDog o) {
        return this.dogType.smatrLevel - o.dogType.smatrLevel;
    }

    public enum DogType {
        POODLE(1),
        LABRADOODLE(2),
        COLLIE(3),
        LABRADOR(4),
        PUG(5);
        int smatrLevel = 6;

       private DogType(int smatrLevel) {
            this.smatrLevel = smatrLevel;
    }
    }
}

public class ComparableExample {

    public static void main(String[] args) {
        System.out.println("------TreeSet start constructing-----");
        Set<SmartDog> dogSet = new TreeSet<>(Set.of(
                new SmartDog(SmartDog.DogType.COLLIE),
                new SmartDog(SmartDog.DogType.LABRADOODLE),
                new SmartDog(SmartDog.DogType.LABRADOR),
                new SmartDog(SmartDog.DogType.PUG),
                new SmartDog(SmartDog.DogType.POODLE)
        ));

        System.out.println(dogSet);
    }
}
