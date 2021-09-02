package br.com.dio;

import model.Gato;

public class primeiropg {
    public static void main(String[] args) {
        Gato gato= new Gato();
        Livro livro = new Livro("casa", 30);
    System.out.println(gato);
        System.out.println(livro);
       /* int a=5;
        int b =3;
        System.out.println("Olá Mundo"+ (a+b));*/
    }
}
class Livro{
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}
