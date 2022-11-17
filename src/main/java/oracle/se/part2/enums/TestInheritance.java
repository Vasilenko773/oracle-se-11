package oracle.se.part2.enums;

public class TestInheritance extends OuterMost {

    public static void main(String[] args) {
        new TestInheritance().testInnerClassMembers();
    }

    public void testInnerClassMembers() {
        new ProtectedInner();
        new PublicInner();
        this.new PackageInner();

        new PublicInner().new NestedInnerSecondLevel();
    }

    public class TestNestedClass extends OuterMost.PublicInner {

    }
}
