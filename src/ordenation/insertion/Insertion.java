package ordenation.insertion;

public class Insertion {
    public void order(int[] v){
        System.out.println("\n default vector");
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);

        }

        System.out.println("\n ordenated");
        for (int i = 0; i < v.length; i++){
            int aux = v[i];
            int j = 0;
            for (j = i - 1; j >= 0 && v[j] > aux; j--){
                v[j + 1] = v[j];
                v[j] = aux;
            }
        }

        System.out.println();
        for (int i = 0; i < v.length; i++){
            System.out.println("[" + v[i] + "]");
        }
    }

}
