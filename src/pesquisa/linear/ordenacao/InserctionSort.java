package pesquisa.linear.ordenacao;

import java.util.Arrays;

public class InserctionSort {

    public static void selectionSort(int array[]){

        for(int i=1;i<array.length;i++){
        int chave = array[i];
        int j = i-1;

        while ((j>=0) && array[i]>chave){
            array[j+1] = array[j];
            j= j-1;
        }
        array[j+1] =chave;
        }
    }

    public static void main(String[] args) {
        int []v = {5,4,3,2,8,7,6};
        selectionSort(v);
        System.out.println("hello wordl");
        System.out.println(Arrays.toString(v));

    }
}
