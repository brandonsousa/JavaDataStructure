package ordenation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);

        System.out.println("What size vector?");
        int size = in.nextInt();

        int[] v = new int[size];

        for (int i = 0; i < size; i++){
            System.out.printf("Say value to [%d]", i+1);
            v[i] = in.nextInt();
        }

        System.out.println("how do u want to order the vector? \n 1: Booble Sort \n 2: Selection Sort \n 3: Insertion Sort");
        int opt = in.nextInt();
        switch (opt){
            case 1:
                Booble b = new Booble();
                b.order(v);
                break;

            case 2:
                SelectionSort s = new SelectionSort();
                s.order(v);
                break;

            case 3:
                Insertion i = new Insertion();
                i.order(v);
                break;

            default:
                break;


        }*/
        List<String>
                lista = new ArrayList<String>();
        lista.add("Maria");
        lista.add("José");
        lista.add("Joaquim");
        lista.remove("José");
        System.out.println(lista.size());



    }

}
