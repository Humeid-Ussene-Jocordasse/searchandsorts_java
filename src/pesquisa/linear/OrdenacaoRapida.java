package pesquisa.linear;

import java.util.ArrayList;

public class OrdenacaoRapida {

    /**Escolhe como pivot, o número mais a direita.*/
   static int[] posicionarPivot(int array[]) {
       //Direita e esquerda recebem o mesmo número de posições que o Array dado e possuem os seus contadores
       int direita[] = new int[array.length];
       int d = 0;
       int esquerda[] = new int[array.length];
       int e = 0;
       int iguais[] = new int[array.length];
       int ig = 0;
       int ordenado = 0;
       /**Pivot é o último elemento*/
       int pivot = array[array.length - 1];
//       System.out.println("Instânciou tudo");

       //Organizando, direita,esquerda e iguais
       for (Integer i : array) {
           if (i > pivot) {
//                System.out.println("Direita "+i);
               direita[d] = i;
//                System.out.println("Entrou "+direita[d]);
               d++;
           } else if (i < pivot) {
//                System.out.println("Esquerda "+i);
               esquerda[e] = i;
//                System.out.println("Entrou "+esquerda[e]);
               e++;
           } else {
//                System.out.println("Igualis "+i);
               iguais[ig] = i;
//                System.out.println("Entrou "+iguais[ig]);
               ig++;
           }
       }
       System.out.println("Dividiu numa wella");

       //Reordenar

       for (Integer i : esquerda) {
           System.out.println(i);
       }

       for (Integer i : iguais) {
           System.out.println(i);
       }

       for (Integer i : direita) {
           System.out.println(i);
       }
return array;
       }

/*
*for (int i =0; i<=e; i++){
           System.out.println(ordenado);
           System.out.println(array[ordenado]);
           array[ordenado] = esquerda[i];
           System.out.println(array[ordenado]);

           ordenado++;
       }
       System.out.println("Ordenou esquerda");
       for (int i =0; i==ig; i++){
           array[ordenado] = iguais[i];
           ordenado++;
       }
       System.out.println("Ordenou iguais");

       for (int i =0; i==d; i++){
           array[ordenado] = direita[i];
           ordenado++;
       }
       System.out.println("Ordenou Direita");
       System.out.println(ordenado);
* */

    /**Escolhe como pivot, o número mais a direita.*/
 /*   static void posicionarPivot2(int array[]) {
        for (Integer i : array) {
            if();

            }
    }*/
        static void apresentarArray(int array[]) {
        System.out.print("[ ");
        for (Integer i : array)
            System.out.print(i + " ");
        System.out.print(']');
                            }


    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Humeid","Jocordasse",10,10));
        pessoas.add(new Pessoa("Antonio","Matusse",10,9));
        pessoas.add(new Pessoa("Biote","Gove",10,15));
        pessoas.add(new Pessoa("Yacub","Joao",10,14));
        pessoas.add(new Pessoa("Boss","Humeid",10,11));

        ArrayList<Pessoa> os = Pessoa.insertionSort(pessoas);

        for (Pessoa a: os) {
            System.out.println(a.getIdade());
        }
        System.out.println(pessoas.size());

    }
}
