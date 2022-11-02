package oracle.se.polimorfizm;

class Tree {
    String type = "unknown";

    String getString() {
        return "Tree";
    }

    String getTreeString() {
        return "Three";
    }
}

class DeciduousTree extends Tree {
    String type = "deciduous";

    String getTreeString() {
        return "Leafy Three";
    }
}

class FruitTree extends Tree {

    String type = "fruit";

    String getTreeString() {
        return "Fruit Three";
    }
}
public class UpcastExample {

    public static void main(String[] args) {
        UpcastExample up = new UpcastExample();
        DeciduousTree mapleTree = new DeciduousTree();
        FruitTree appleTree = new FruitTree();

        Tree genericTree = (Tree) mapleTree;

        System.out.println(mapleTree.type);
        System.out.println(((Tree) mapleTree).type);
        up.printTree((Tree) appleTree);
    }

    public void printTree(Tree tree) {
        System.out.println("Tree type = " + tree.getTreeString());
    }
}
