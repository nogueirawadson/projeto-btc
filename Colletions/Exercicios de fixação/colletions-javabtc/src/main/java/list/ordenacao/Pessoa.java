package main.java.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa ( " +
                "nome : " + nome  +
                " - idade : " + idade +
                " - altura : " + altura + ')' +  "\n";
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
