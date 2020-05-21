package tree.binarySearch;

import java.util.Random;

public class Implementation {
    public static void main(String[] args){
        Tree<Integer> tree = new Tree<>();

        Integer number;

        for (int i = 0; i < 1000000; i++){
            number = new Random().nextInt(333);
            System.out.println("The value on position ["+i+"] it's " + number);
            tree.insertNode(number);
        }

        System.out.println("\n \n");
        System.out.println("Show tree in preOrder");
        tree.preOrder();

        System.out.println("\n \n");
        System.out.println("Show tree in inOrder");
        tree.inOrder();

        System.out.println("\n \n");
        System.out.println("Show tree in posOrder");
        tree.posOrder();
    }
}