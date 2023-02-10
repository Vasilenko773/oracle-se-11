package interview.patern.singelton;

public final class SingletonExample {
    private static  SingletonExample INSTANCE;
    private SingletonExample() {};

    private static SingletonExample singletonExample() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
