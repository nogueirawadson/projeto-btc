package main.java.Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
       // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento() {
       // Set<LocalDate> dateSet = eventosMap.keySet();
        // Collections<Evento>  values = eventosMap.values();
        // eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " Acontecerána data: " + proximaData);
                break;
            }

        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

     //   agendaEventos.adicionarEvento();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 02), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 11), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 30), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 02), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 12), "Evento 4", "Atracao 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


        System.out.println("Data de Hoje: " + LocalDate.now());


    }
}
