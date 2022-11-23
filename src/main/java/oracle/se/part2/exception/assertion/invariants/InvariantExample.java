package oracle.se.part2.exception.assertion.invariants;

import java.util.ArrayList;
import java.util.Arrays;

public class InvariantExample {

    private enum  petType {
        DOG, CAT, HAMSTER, GERBIL, PARROT
    }

    public static void main(String[] args) {
        InvariantExample ie = new InvariantExample();
        for (petType pt : petType.values()) {
            System.out.println(ie.getPetTypeAgeDescription(pt, 0));
        }
    }

    private String getTypeDietaryNeeds(petType type) {
        switch (type) {
            case DOG:
                return "dog";
            case CAT:
                return "cat";
            case HAMSTER:
                return "hamster";
            case GERBIL:
                return "gerbil";
            default:
                assert false: "false " + type;
        }
        return null; // control-flow инвариант
    }

    public String getPetTypeAgeDescription(petType type, int age) {
        if (age < 0) throw new IllegalArgumentException("age cannot be negative");
        assert age >=0;
        String description = "ADULT";
        if (type == petType.CAT || type == petType.DOG) {
            if (age > 7) description = "SENIOR";
            else if (age < 1) description = (type == petType.CAT) ? "KITTEN" : "PUPPY";
        } else {
            assert (type == petType.GERBIL || type == petType.HAMSTER);
            if (age > 3) description = "SENIOR";
            else if (age < 1) description = "PUP";
        }
        assert (new ArrayList(Arrays.asList(new String[] {"ADULT", "SENIOR", "KITTEN", "PUPPY", "PUP"})).indexOf(description) > -1) :
        type + " " + age;
        return description;
    }

}
