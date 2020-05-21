package vectors;

import java.util.Scanner;
import java.util.Arrays;

public class Seventh {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor na posição " + i);
			a[i] = entrada.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
	}
}
