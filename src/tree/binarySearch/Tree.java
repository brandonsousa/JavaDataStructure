package tree.binarySearch;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;

    public Tree() {
        root = null;
    }

    public void insertNode(T value) {
        if (root == null) {
            root = new Node<T>(value);
        } else {
            root.insert(value);
        }
    }

    public void preOrder() {
        preOrderHelper(root);
    }

    public void inOrder() {
        inOrderHelp(root);
    }

    public void posOrder() {
        posOrderHelp(root);
    }

    private void preOrderHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }

    private void inOrderHelp(Node<T> node) {
        if (node == null) {
            return;
        }

        inOrderHelp(node.left);
        System.out.printf("%s ", node.data);
        inOrderHelp(node.right);
    }

    private void posOrderHelp(Node<T> node) {
        if (node == null) {
            return;
        }
        posOrderHelp(node.left);
        posOrderHelp(node.right);
        System.out.printf("%s ", node.data);
    }
}
