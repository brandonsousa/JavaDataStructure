package matrix;

import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas linhas terá a matriz");
        int l = input.nextInt();
        System.out.println("Quantas colunas terá a matriz");
        int r = input.nextInt();

        int[][] m = new int[l][r];

        Random rn = new Random();

        System.out.printf("Montando a matriz m[%d][%d] \n", l, r);
        for (int i = 0; i < l; i++){
            for (int j = 0; j < r; j++){
                m[i][j] = rn.nextInt(99);
            }
        }
        System.out.println();
        System.out.println("A matriz: \n");
        for (int i = 0; i < l; i++){
            for (int j = 0; j < r; j++){
                System.out.printf("\t %d \t", m[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("A matriz trasnposta: \n");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < l; j++){
                System.out.printf("\t %d \t", m[j][i]);
            }
            System.out.println();
        }




    }
}
