package matrix;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        int[][] m = new int[3][3];
        
        System.out.println("Matriz M[3][3]\n");
        
        for(int i=0 ; i < 3 ; i++){
            for(int j = 0; j < 3 ; j ++){
                System.out.printf("Insira o elemento M[%d][%d]: ",i+1,j+1);
                m[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("\nA Matriz ficou: \n");
        for(int i=0 ; i < 3 ; i++){
            for(int j = 0; j < 3 ; j ++){
                System.out.printf("\t %d \t",m[i][j]);
            }
            System.out.println();
        }
		
	}
}
