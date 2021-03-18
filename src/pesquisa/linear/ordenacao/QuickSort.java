package pesquisa.linear.ordenacao;

import java.util.Arrays;

public class QuickSort {

    static void quicksorteando(int array[]){
        quickSort(array,0,array.length-1);
    }

    static void quickSort(int[] array, int inicio, int fim){
        if (inicio<fim){
            int pivo = separar(array, inicio, fim);
            quickSort(array,inicio, pivo-1);
            quickSort(array,pivo+1,fim);
        }
    }

    private static int separar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio;
        for(int j = inicio; j<fim;j++){
            if (array[j]<=pivo) {
                    troque(array,i,j);
                i++;
            }
        }
        troque(array, i,fim);
        return i;
    }

    private static void troque(int[] array, int i, int j) {
        int aux = array [i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void main(String[] args) {
        int []v = {5,4,3,2,8,7,6};
        quicksorteando(v);
        System.out.println(Arrays.toString(v));
    }

}
