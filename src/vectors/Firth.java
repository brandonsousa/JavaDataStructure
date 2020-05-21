package vectors;

public class Firth {
	public static void mains(String[] args) {
		int[] a = {1, 14, 3, 17, 28, 56, 97, 2, 4, 112};
		int[] b = {13, 16, 119, 541, 202, 13, 12, 5, 19, 7};
		int[] c = new int[10];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
	}
}
