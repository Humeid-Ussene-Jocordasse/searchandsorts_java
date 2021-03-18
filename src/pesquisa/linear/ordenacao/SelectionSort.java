package pesquisa.linear.ordenacao;

import java.util.Arrays;

public class SelectionSort {


    public static void selectionSort(int[] array){
        for (int i=0; i<array.length; i++){
            int menor =i;
            for (int j=i+1; j<array.length ; j++){
                if(array[j]<array[menor]){
                    menor =j;
                }
            }
            //Trocar
            int aux = array[i];
            array[i] = array[menor];
            array[menor] =aux;
        }

    }

    public static void main(String[] args) {
        int []v = {5,4,3,2,8,7,6};
        selectionSort(v);
        System.out.println(Arrays.toString(v));
    }
}
