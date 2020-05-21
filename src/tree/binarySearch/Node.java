package tree.binarySearch;

public class Node<T extends Comparable<T>> {

    Node<T> left;
    Node<T> right;

    T data;

    public Node(T data) {
        this.data = data;
        left = right = null;
    }

    public void insert(T value) {
        if (value.compareTo(data) < 0) {
            if (left == null) {
                left = new Node<T>(value);
            } else {
                left.insert(value);
            }
        } else if (value.compareTo(data) > 0) {
            if (right == null) {
                right = new Node<T>(value);
            } else {
                right.insert(value);
            }
        }
    }

}
