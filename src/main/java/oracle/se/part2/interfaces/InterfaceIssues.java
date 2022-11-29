package oracle.se.part2.interfaces;

import java.util.Objects;

interface ProblemFreeInterface {

    default Object clone() throws CloneNotSupportedException {
        return "++sadasd";
    }

    class ProblemFreeClass implements ProblemFreeInterface {
        public int id;

        ProblemFreeClass(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "ProblemFreeClass{" +
                    "id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ProblemFreeClass that = (ProblemFreeClass) o;
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return null;
        }
    }

    public class InterfaceIssues extends ProblemFreeClass implements ProblemFreeInterface {
        InterfaceIssues(int id) {
            super(id);
        }

        public static void main(String[] args) throws CloneNotSupportedException {
            InterfaceIssues it = new InterfaceIssues(1);
            ProblemFreeClass it2 = new InterfaceIssues(1);
            System.out.println(it2.clone());
            boolean isEquals = it.equals(it2);
            System.out.println("hashCode = " + it.hashCode());
            System.out.println(it);
        }
    }
}