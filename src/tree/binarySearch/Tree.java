package tree.binarySearch;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;
    private int c = 0;

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

    public void count() {
        System.out.println(String.valueOf(counterHelp(root)));
    }

    public void countNodes() {
        System.out.println(countNodesHelpe(root));
    }

    private int counterHelp(Node<T> node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                c++;
            }
            this.counterHelp(node.left);
            this.counterHelp(node.right);
        }
        return c;
    }

    private int countNodesHelpe(Node<T> node) {
        if (node != null) {
            if (node.left != null){
                if (node.right != null){
                    c++;
                }
            }
            this.countNodesHelpe(node.left);
            this.countNodesHelpe(node.right);
        }
        return c;
    }

}
