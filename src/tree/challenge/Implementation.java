package tree.challenge;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {

        Tree tree = new Tree();

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int length = in.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insira a matricula " + i);
            Integer registration = in.nextInt();

            System.out.println("Insira o nome " + i);
            String name = in.next();

            Student student = new Student(registration, name);
            tree.setStudent(student);
        }

        System.out.println("PreOrder");
        tree.preOrder();

        System.out.println("InOrder");
        tree.inOrder();

        System.out.println("PosOrder");
        tree.posOrder();

        System.out.println("Diga a matricula do aluno ao qual deseja saber o nome");
        tree.findByRegistration(in.nextInt());

    }
}
