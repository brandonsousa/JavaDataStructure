package ordenation.selectionSort;

public class SelectionSort {

    public void order(int[] v){

        int value = 0, minusValue, position = 0;

        System.out.println("\n Default vector");

        for (int i = 0; i < v.length; i++){
            System.out.println("["+ v[i] +"]");
        }

        //ordenation
        for (int i = 0; i < v.length - 1; i++){
            value = v[i];
            minusValue = v[i+1];
            position = i + 1;

            //find minus value
            for (int j = i; j < v.length; j++){

                if (v[j] < minusValue){
                    minusValue = v[j];
                    position = j;
                }

            }

            //switch
            if (minusValue < value){
                v[i] = v[position];
                v[position] = value;
            }

        }

        System.out.println("\n Ordenade vector");
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }

}
