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
			System.out.println("informe um n�meros para a["+i+"]");
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
		
		System.out.println("N�meros positivos ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("N�meros negativos ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("N�meros n�o +/-");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("os n�meros 0.0 na lista de positivos e negativos s�o posi��es n�o preenchidas");
		
	}

}
