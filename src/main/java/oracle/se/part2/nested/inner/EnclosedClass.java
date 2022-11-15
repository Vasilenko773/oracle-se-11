package oracle.se.part2.nested.inner;

import lombok.Getter;

public class EnclosedClass {

    public String outerName = "outer";

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

        public String getOtherName() {
            return outerName;
        }

    }

    public static void main(String[] args) {
        EnclosedClass enclosedClass = new EnclosedClass("ss");
        enclosedClass.doSomethingOnInstance();

       InnerMemberClass i = new EnclosedClass("Hello").new InnerMemberClass();
        InnerMemberClass i1 = new EnclosedClass("World").new InnerMemberClass();
        System.out.println(i.getOtherName());
        System.out.println(i1.getOtherName());
    }
}
