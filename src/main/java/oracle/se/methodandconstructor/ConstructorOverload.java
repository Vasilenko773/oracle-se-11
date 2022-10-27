package oracle.se.methodandconstructor;

class MixAndMax {
    String mix;
    String match;
    String maxAndMatch;
    static int count = 0;

    MixAndMax() {
        count++;
    }

    MixAndMax(String maxAndMatch) {
        this();
        this.maxAndMatch = maxAndMatch;
        System.out.println(this.maxAndMatch + " " + count);
    }

    MixAndMax(String mix, String match) {
        this(mix + " and " + match);
        this.mix = mix;
        this.match = match;
    }
}

public class ConstructorOverload {

    public static void main(String[] args) {
      new MixAndMax("mix", "math");
      new  MixAndMax("Mix or MAth");
      new MixAndMax();
      new MixAndMax("not", "not");
    }
}
