package oracle.se.part2.nested.local;

public class LocalClassExample {

    private String defaultName = "Bob Marley";
    private String lastName = "Doe";
    private void methodWithLocalClass() {
        class LocalClass {
            String name;
            LocalClass(String name) {
                if (name == null) {
                    this.name = defaultName;
                } else {
                    this.name = name;
                }
                this.name += " " + lastName;
            }
            private void performSomeAction() {
                System.out.println("LocalClass.name = " + name);
            }
        }
        LocalClass jeff = new LocalClass("Jeff");
        LocalClass martha = new LocalClass("Martha");
        LocalClass bob = new LocalClass("Bob");
        LocalClass sandra = new LocalClass(null);
        jeff.performSomeAction();
        martha.performSomeAction();
        bob.performSomeAction();
        sandra.performSomeAction();
    }

    public static void main(String[] args) {
        LocalClassExample le = new LocalClassExample();
        le.methodWithLocalClass();
    }
}
