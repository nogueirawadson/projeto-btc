package main.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome( String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }



    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wadson", 981481087);
        agendaContatos.adicionarContato("Wadson Luiz", 981481087);
        agendaContatos.adicionarContato("Wadson", 981481088);
        agendaContatos.adicionarContato("Wadson Nogueira ", 981481088);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Wadson");
        agendaContatos.exibirContatos();
    }
}
