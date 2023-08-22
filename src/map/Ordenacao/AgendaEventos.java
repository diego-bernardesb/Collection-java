package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data , new Evento(nome,atracao));
    }

    public void exibirAgenda(){
         Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
         LocalDate dataAtual = LocalDate.now();
         LocalDate proximaData = null;
         Evento proximoEvento = null;
         Map<LocalDate , Evento> eventoTreeMap = new TreeMap<>(eventoMap);//mantem os eventos ordenados crescentemente
        for(Map.Entry<LocalDate, Evento> e: eventoTreeMap.entrySet()){ //gera o loop
            if(e.getKey().equals(dataAtual) || e.getKey().isAfter(dataAtual)){
                proximaData = e.getKey();
                proximoEvento = e.getValue();
                System.out.println("O próximo evento: "+ proximoEvento +" acorrerá na data: "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEvento = new AgendaEventos();

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 26), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
