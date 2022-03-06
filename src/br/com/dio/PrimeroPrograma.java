package br.com.dio;

import model.Gato;

import java.lang.reflect.Constructor;

public class PrimeroPrograma {
    public static void main(String[] args){
        /*int a=5;
        int b=3;

        System.out.println("Hello world" +(a+b));*/
        Gato gato = new Gato();
        System.out.println("..."+gato);
        Livro livro = new Livro("O sonho", 200);
        System.out.println("..."+livro);

    }
}
class Livro{
    private String nome;
    private  Integer numPagina;

    public Livro(String nome, Integer numPagina){
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumPagina(){
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}
