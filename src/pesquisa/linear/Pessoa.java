package pesquisa.linear;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String apelido;
    private int BI;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String apelido, int BI, int idade) {
        this.nome = nome;
        this.apelido = apelido;
        this.BI = BI;
        this.idade = idade;
    }

    ArrayList<Integer> sorted = new ArrayList<>();

    public ArrayList<Integer> quickSort(int[] lista){
        ArrayList<Integer> maiores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();
        int pivot = lista[lista.length-1];
        for (Integer i:lista) {
            if(i>pivot) maiores.add(i); else menores.add(i);
        }

        return maiores;
    }


    public static ArrayList<Pessoa> insertionSort(ArrayList<Pessoa> array){
        ArrayList<Pessoa> ordenado = new ArrayList<>();
        for(int i=0; i<array.size(); i++){
            Pessoa menor = array.get(i);
            for(int j=i+1; i<array.size(); i++)
                if (array.get(j).getIdade()<menor.getBI()){
                    menor = array.get(j);
                }
            ordenado.add(menor);
        }
        return ordenado;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getBI() {
        return BI;
    }

    public void setBI(int BI) {
        this.BI = BI;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
