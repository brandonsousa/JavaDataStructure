package vectors;

import java.util.Scanner;

public class Ninth {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] a = new int[10];
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("insira um número inteiro " + i);
			a[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 50) {
				System.out.println("Nº > 50: " + a[i] + " encontrado na posição " + i);
			}
		}
		
		
	}
	
}
