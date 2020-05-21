package vectors;

import java.util.Arrays;

public class Eighth {
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] c = new int[20];
		int j = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < 10; i++) {
			c[j] = a[i];
			j = j + 1;
			c[j] = b[i];
			j = j + 1;
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
