package vectors;

import java.util.Scanner;

public class Tenth {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float[] a = new float[8];
		
		float[] b = new float[8];
		float[] c = new float[8];
		float[] d = new float[8];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("informe um números para a["+i+"]");
			a[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				b[i] = a[i]; 
			}else if(a[i] > 0) {
				c[i] = a[i];
			}else {
				d[i] = a[i];
			}
		}
		
		System.out.println("Números positivos ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("Números negativos ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("Números não +/-");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("os números 0.0 na lista de positivos e negativos são posições não preenchidas");
		
	}

}
