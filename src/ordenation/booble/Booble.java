package ordenation.booble;

public class Booble {
    public  void order(int[] v){
        int aux = 0;
        int i = 0;

        System.out.println("\n default vector ");
        for(i = 0; i < v.length; i++){
            System.out.println(" "+v[i]);
        }
        System.out.println(" ");

        for(i = 0; i < v.length; i++){
            for(int j = 0; j < v.length - 1; j++){
                if(v[j] > v[j + 1]){
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                    System.out.println("in verifications " + v[i] + " "+  v[i+1] + " "+  v[j+1] + " " + v[j]);
                }
            }
        }
        System.out.println("Ordenated");
        for(i = 0; i<v.length; i++){
            System.out.println(" " + v[i]);
        }
    }
}
