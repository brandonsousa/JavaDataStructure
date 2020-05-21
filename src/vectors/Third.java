package vectors;

public class Third {
	public static void main(String[] args) {
		int[] v = {1, 14, 3, 17, 28, 56, 97, 2};
		
		int[] b = new int[8];
		
		for (int i = 0; i < v.length; i++) {
			b[i] = v[i] * 2;
			System.out.println(b[i]);
		}
	}

}
