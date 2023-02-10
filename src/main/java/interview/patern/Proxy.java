package interview.patern;

interface ExpensiveObject {
    void process();
}
class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }
    @Override
    public void process() {
        System.out.println("processing complete.");
    }
    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }
}

class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;
    @Override
    public void process() {
        System.out.println("before");
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
        System.out.println("after");
    }
}


public class Proxy {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
