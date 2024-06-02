package main.java.list.operacoesBasicas;
import main.java.list.operacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;



public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // adicionar tarefa em uma lista de tarefas
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // remover tarefa em uma lista de tarefas
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    // Numero total de tarefas
    public int obterNumeroTotaldeTarefas() {
        return tarefaList.size();
    }
    // imprimindo total de tarefas
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
    public static void main( String[] args) {
       // Public String descricao();
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de elementos na Lista é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");

        listaTarefa.adicionarTarefa("Tarefa 2");

        listaTarefa.adicionarTarefa("Tarefa 3");

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}




