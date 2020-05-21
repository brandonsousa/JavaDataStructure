package vectors;

import java.util.Scanner;

public class Sixth {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int[] a = new int[5];
			int maior = a[0], menor = Integer.MAX_VALUE;

			for(int i = 0; i < a.length; i++){
				System.out.println("informe o valor na p " + i);
				a[i] = entrada.nextInt();
				if(a[i] > maior){
					maior = a[i];
				}
			}
			for (int j = 0; j < a.length; j++) {
				if(a[j] < menor){
					menor = a[j];
				}
			}
			System.out.println("Maior valor "+ maior);
			System.out.println("Menor valor "+ menor);

		}
}
