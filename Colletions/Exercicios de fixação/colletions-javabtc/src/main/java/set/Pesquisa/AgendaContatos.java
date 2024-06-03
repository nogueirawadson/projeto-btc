package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo private

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato( String nome, int numero) {
       contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome( String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public void NumeroContatos() {
        contatoSet.size();
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Wadson", 91481087);
        agendaContatos.adicionarContato("LuizNogueira", 81481087);
        agendaContatos.adicionarContato("Wadson", 81481087);
        agendaContatos.adicionarContato("Nogueira", 94393092);

        System.out.println((agendaContatos.pesquisarPorNome("Wadson")));
        System.out.println(agendaContatos.atualizarNumeroContato("Wadson", 3333));
        agendaContatos.NumeroContatos();
        agendaContatos.exibirContatos();
    }

}
