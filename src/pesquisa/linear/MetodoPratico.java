package pesquisa.linear;

import java.util.ArrayList;

public class MetodoPratico {

    int pesquisaLinear(int index, int a[]){
        for (int i=0; i<a.length; i++)
            if(a[i] == index)
                return i;

        return -1;
    }

    int pesquisaLinearWhile(int index, int a[]){

        int i=0;
        while(i<a.length)
            if(a[i] == index)
                return i; else i++;

        return -1;
    }

    int pesquisaLinearDoWhile(int index, int a[]){

        int i=0;

            do
                if(a[i] == index)
                return i; else i++;
            while (i<a.length);

        return -1;
    }

    int pesquisaLinearRecursivo(int index, int a[], int i){
        if(i==a.length)
            return -1;
        if(a[i]!=index)
        return pesquisaLinearRecursivo(index,a,i+1);
       return i;
    }


    int pesquisarArrayList(int bi, ArrayList<Pessoa> p) {

        for (Pessoa p1 : p) {
            if (p1.getBI() == bi) return p.indexOf(p1);
        }
        return -1;
    }


//    int pesquisaBinariaRecursiva(int chave, int array[]){
//        int a = array.length-1/2;
//
//
////       if(array[a]!=chave){
////           return pesquisaBinariaRecursiva(chave, )
////       }
//
//    }

    public static void main(String[] args) {
//        MetodoPratico m1 = new MetodoPratico();
//        int array[] = {10,12,5,7,0,-10,-2,-5,3,6};
//        System.out.println( m1.pesquisaLinearRecursivo(-5,array,0));
        System.out.println(5<5);
    }
}
