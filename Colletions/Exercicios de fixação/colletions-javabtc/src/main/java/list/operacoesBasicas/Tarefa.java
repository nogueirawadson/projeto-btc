package main.java.list.operacoesBasicas;
import main.java.list.operacoesBasicas.ListaTarefa;


public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {

        return descricao;

    } public String toString() {
        return "Tarefa: (" +
                "descricao='"+ descricao + '\'' +
                ')';
    }
}
