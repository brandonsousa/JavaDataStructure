package collections.hashmap;

import collections.classes.Student;

import java.util.Scanner;

public class StudentCRUD {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Student student = new Student();



        do {
            System.out.println("Qual operação deseja realziar");
            System.out.println("1 -> Adicionar");
            System.out.println("2 -> Buscar");
            System.out.println("3 -> Excluir");
            System.out.println("4 -> Todos");
            System.out.println("0 -> Sair");
            switch (in.nextInt()){
                case 1:
                    System.out.println("Informe a matricula");
                    student.setRegistration(in.nextInt());
                    System.out.println("Infome o nome");
                    student.setName(in.next());
                    student.addStudent(student);
                    break;
                case 2:
                    System.out.println("Informe a matricula");
                    System.out.println(student.findStudent(in.nextInt()));
                    break;
                case 3:
                    System.out.println("Informe a matricula");
                    System.out.println(student.removeStudent(in.nextInt()));
                    break;
                case 4:
                    System.out.println("Alunos");
                    System.out.println(student.allStudent());
                    break;
                default:
                    break;
            }
        }while (in.nextInt() != 0);


    }

}
