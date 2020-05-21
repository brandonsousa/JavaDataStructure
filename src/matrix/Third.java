package matrix;

import java.util.Random;

public class Third {
    public static void main(String[] args){

        int[][] m = new int[3][3];

        Random nr = new Random();

        System.out.println("Gerando a matriz...\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                m[i][j] = nr.nextInt(99);
                System.out.printf("Número para a posição m[%d][%d] %d \n", i + 1, j + 1, m[i][j]);
            }
        }

        System.out.println("\n A matriz ficou: \n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("\t %d \t", m[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (m[i][j] != m[j][i]){
                    System.out.println("Assimétrica");
                }
                System.out.println("Simétrica");
            }
        }

    }
}
