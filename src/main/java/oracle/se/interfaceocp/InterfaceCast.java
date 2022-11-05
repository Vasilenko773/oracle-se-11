package oracle.se.interfaceocp;

interface Laughable {
    void laugh();
}

class Joke implements Laughable {

    @Override
    public void laugh() {
        System.out.println("That joke is laughable");
    }
}

class Story {
    public void read() {
        System.out.println("This story is a good read");
    }
}

class FunnyStory extends Story implements Laughable {
    @Override
    public void laugh() {
        System.out.println("This story is funny");
    }

    public void read() {
        System.out.println("This story is a good giggle");
    }
}

class Farce extends Story implements  Laughable {
    @Override
    public void laugh() {
        System.out.println("This story is in a farcical way");
    }
}

public class InterfaceCast {

    public static void main(String[] args) {
        Story story = new Story();
        Story farce = new Farce();
        FunnyStory funnyStory = new FunnyStory();
        Joke joke = new Joke();

        testLaughable(joke);
        testLaughable(funnyStory);

        testStory(story);
        testStory(funnyStory);

      //  testLaughable((Laughable) story); // ошибки компилятора нет но это приведе к ClassCastEcxeption
//        testStory((Story) joke); нельзя выполнить приведение типов так как шутка не имеет отношения к истории
        testLaughable((Laughable) farce);
    }

    public static void testLaughable(Laughable l) {
        l.laugh();
    }

    public static void testStory(Story s) {
        s.read();
    }
}
