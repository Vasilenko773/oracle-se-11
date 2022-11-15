package oracle.se.part2.nested.inner;

import lombok.Getter;

public class EnclosedClass {

    public String outerName = "outer";
    public InnerMemberClass innerClass = new InnerMemberClass();

    public EnclosedClass(String outerName) {
        this.outerName = outerName;
    }

    public void doSomethingOnInstance() {
        System.out.println("doSomethingOnInstance EnclosedClass");
        System.out.println(new InnerMemberClass().getInstanceName());
    }

    @Getter
    public class InnerMemberClass {

        private String instanceName = "instanceName";
        String outerName = "outer Name";

        public String getOtherName() {
            String outerName = "first";
            return outerName + " " + this.outerName + " " + EnclosedClass.this.outerName;
        }

        public static final String staticName = "static name inner class";

    }

    public static void main(String[] args) {
        EnclosedClass enclosedClass = new EnclosedClass("ss");
        enclosedClass.doSomethingOnInstance();
        EnclosedClass e = new EnclosedClass("external");

        InnerMemberClass i = new EnclosedClass("Hello").new InnerMemberClass();
        InnerMemberClass i1 = new EnclosedClass("World").new InnerMemberClass();
        System.out.println(i.getOtherName());
        System.out.println(i1.getOtherName());
        e.innerClass.instanceName = "testing";
        System.out.println(e.innerClass.getInstanceName());

    }
}
