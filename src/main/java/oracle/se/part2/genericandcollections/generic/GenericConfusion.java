package oracle.se.part2.genericandcollections.generic;

import lombok.ToString;

@ToString
class Container<Number> {

    Number myNumber;

    Container(Number myNumber) {
        this.myNumber = myNumber;
        System.out.println(this);
    }
}

public class GenericConfusion {
    public static void main(String[] args) {
        Container<String> c1 = new Container<>("Hello");

        Container<Integer[]> c2 = new Container<>(new Integer[]{1, 2, 3, 4});

        Container<UnknownError> c3 = new Container<>(new UnknownError("testing"));

        CardboardContainer<String> n1 = new CardboardContainer<>("Hello");
        CardboardContainer<String> n2 = new CardboardContainer<>(3);
        CardboardContainer<String> n3 = new <Integer> CardboardContainer<String>(3);

    }
}


class CardboardContainer<T> {
    T myField;

    CardboardContainer(T myField) {
        System.out.println("in T constructor");
        this.myField = myField;
    }

    <T extends Number>  CardboardContainer(T myField) {
        System.out.println("in T2 constructor");
//        this.myField = myField;
    }
}
