package tree.challenge;

public class Tree {

    private Node node;
    private Tree left;
    private Tree right;

    public Tree() {
    }

    public void setStudent(Student student) {
        Node node = new Node(student);
        insert(node);
    }

    public void insert(Node node) {
        if (this.node == null) {
            this.node = node;
        } else {
            if (node.getStudent().getRegistration() > this.node.getStudent().getRegistration()) {
                if (this.right == null) {
                    this.right = new Tree();
                }
                this.right.insert(node);
            } else if (node.getStudent().getRegistration() < this.node.getStudent().getRegistration()) {
                if (this.left == null) {
                    this.left = new Tree();
                }
                this.left.insert(node);
            }
        }
    }

    public void findByRegistration(int registration) {
        if (this.node.getStudent().getRegistration() == registration) {
            System.out.println(this.node.getStudent().getName());
        } else {
            if (this.node.getStudent().getRegistration() < registration) {
                if (this.left == null) {
                    this.left.findByRegistration(registration);
                }
            } else {
                if (this.right == null) {
                    this.right.findByRegistration(registration);
                }
            }
        }
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public void preOrder() {
        preOrderHelper();
    }

    public void inOrder() {
        inOrderHelp();
    }

    public void posOrder() {
        posOrderHelp();
    }

    private void preOrderHelper() {
        if (this.node == null) {
            return;
        }

        System.out.println("Matricula -> " + this.node.getStudent().getRegistration() +
                " Nome -> " + this.node.getStudent().getName());

        if (this.left != null) {
            this.left.preOrderHelper();
        }

        if (this.right != null) {
            this.right.preOrderHelper();
        }

    }

    private void inOrderHelp() {
        if (this.node == null) {
            return;
        }

        if (this.left != null) {
            this.left.inOrderHelp();
        }

        System.out.println("Matricula -> " + this.node.getStudent().getRegistration() +
                " Nome -> " + this.node.getStudent().getName());

        if (this.right != null) {
            this.right.inOrderHelp();
        }

    }

    private void posOrderHelp() {
        if (this.node == null) {
            return;
        }
        if (this.left != null) {
            this.left.posOrderHelp();
        }

        if (this.right != null) {
            this.right.posOrderHelp();
        }

        System.out.println("Matricula -> " + this.node.getStudent().getRegistration() +
                " Nome -> " + this.node.getStudent().getName());
    }

}
