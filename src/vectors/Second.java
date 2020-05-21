package vectors;

import java.util.Scanner;

public class Second {

    public static void main(String[] args){
    	int[] v = {1, 2, 4, 20, 50, 13};
    	
    	int r = 0;
    	
    	for (int i = 0; i < v.length; i++) {
			r += v[i];
		}
    	System.out.println(r);

    }

}
