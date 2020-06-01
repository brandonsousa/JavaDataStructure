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
        System.out.println(counterHelp(root));
    }

    public void countNodes() {
        System.out.println(countNodesHelp(root));
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

    private int countNodesHelp(Node<T> node) {
        if (node != null) {
            if (node.left != null) {
                if (node.right != null) {
                    c++;
                }
            }
            this.countNodesHelp(node.left);
            this.countNodesHelp(node.right);
        }
        return c;
    }

    public void countValueNodes() {
        System.out.println(countValueNodesHelp(root));
    }

    private int countValueNodesHelp(Node<T> node) {
        if (node != null){
            Object o = node.data;
            c += (Integer) o;
            countValueNodesHelp(node.left);
            countValueNodesHelp(node.right);
        }
        return c;
    }

}
