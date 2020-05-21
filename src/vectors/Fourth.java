package vectors;

public class Fourth {
	public static void main(String[] args) {
		
		int[] v = {1, 14, 3, 17, 28, 56, 97, 2, 54, 12};
		int[] b = new int[10];
		
		for (int i = 0; i < v.length; i++) {
			
			b[i] = v[i] * i;
			System.out.println(b[i]);
			
		}
		
	}
}
