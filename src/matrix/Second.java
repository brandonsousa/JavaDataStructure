package matrix;

import java.util.Random;

public class Second {

    public static void main(String[] args){
        System.out.println("Aguarde......");

        int[][] m = new int[3][3];

        int nm = 0;

        Random number = new Random();

        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                m[i][j] = number.nextInt(99);
            }
        }

        System.out.println("\nA Matriz gerada:");
        for(int i=0 ; i < 3 ; i++){
            for(int j = 0; j < 3 ; j ++){
                System.out.printf("\t %d \t",m[i][j]);
                if (m[i][j] > nm){
                    nm = m[i][j];
                }
            }
            System.out.println();
        }

        System.out.printf("Multiplicando pelo maior número %d", nm);
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("\t %d \t",m[i][j] * nm);
            }
            System.out.println();
        }
    }

}
