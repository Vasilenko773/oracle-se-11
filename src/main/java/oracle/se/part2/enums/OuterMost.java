package oracle.se.part2.enums;

public class OuterMost {
    private String outerString = "Attribute of OuterMost class";

    public class PublicInner {
        private String innerString = "Attribute of public inner class";

        public PublicInner() {
            System.out.println("PublicInner outerString = " + outerString);
            System.out.println("PublicInner outerString = " + OuterMost.this.outerString);
        }

        public class NestedInnerSecondLevel {
            public NestedInnerSecondLevel() {
                System.out.println("________");
                System.out.println("NestedInnerSecondLevel outerString = " + outerString);
                System.out.println("NestedInnerSecondLevel outerString = " + OuterMost.this.outerString);
                System.out.println("NestedInnerSecondLevel outerString = " + innerString);
                System.out.println("NestedInnerSecondLevel outerString = " + OuterMost.PublicInner.this.innerString);
            }
        }
    }

    class PackageInner {
        public PackageInner() {
            System.out.println("PackageInner instantiated");
        }
    }

    protected class ProtectedInner {
        public ProtectedInner() {
            System.out.println("ProtectedInner instantiated");
        }
    }

    private class PrivateInner {
        public PrivateInner() {
            System.out.println("PrivateInner instantiated");
        }
    }
}


class InnerClassExtras {
    public static void main(String[] args) {
        OuterMost outerMost = new OuterMost();

        OuterMost.PublicInner publicInner = outerMost.new PublicInner();
        OuterMost.PackageInner packageInner = outerMost.new PackageInner();
        OuterMost.ProtectedInner protectedInner = outerMost.new ProtectedInner();
        OuterMost.PublicInner.NestedInnerSecondLevel nestedInnerSecondLevel = outerMost.new PublicInner().new NestedInnerSecondLevel();
    }
}


