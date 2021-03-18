package pesquisa.linear.ordenacao;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] array){

        for (int ultimo = array.length-1; ultimo<array.length; ultimo--){

            for (int i = 0; i<ultimo;i++){
                if (array[i]>array[i+1]){
                    troque(array,i,i+1);
                }
            }
        }

    }

    private static void troque(int[] array, int i, int j) {
        int aux = array [i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void main(String[] args) {
        int []v = {5,4,3,2,8,7,6};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
}
