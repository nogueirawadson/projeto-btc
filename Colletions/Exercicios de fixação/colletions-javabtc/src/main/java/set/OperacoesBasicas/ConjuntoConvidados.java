package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    //atributo

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite (int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidaos() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidaos() + " Covidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Wadson", 1234);
        conjuntoConvidados.adicionarConvidado("Luiz", 1235);
        conjuntoConvidados.adicionarConvidado("Nogueira", 1236);
        conjuntoConvidados.adicionarConvidado("Veloso", 1237);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);


        System.out.println("Existem " + conjuntoConvidados.contarConvidaos() + " Covidados dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
