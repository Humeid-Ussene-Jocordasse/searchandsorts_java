package pesquisa.linear.pesquisa;

public class PesquisaBinaria {
    public static void main(String[] args) {

    }

    static int iniializarBuscaRecursiva(int [] array, int chave){
       return buscaRecursiva(array,chave,0,array.length-1);
    }

    static int buscaRecursiva(int [] array,int chave,int inicio, int fim){
        int media = (inicio + fim) /2;

        if (inicio > fim) return -1;

        if(array[media]==chave) return media;

        if(array[media]<chave) return buscaRecursiva(array,chave,media+1,fim); else
            return buscaRecursiva(array, chave,inicio,media-1);
    }

}
