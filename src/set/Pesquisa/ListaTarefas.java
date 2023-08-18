package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> listTarefa;

    public ListaTarefas() {
        this.listTarefa = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        listTarefa.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t: listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        listTarefa.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(listTarefa);
    }

    public int contarTarefas(){
        return listTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConluida = new HashSet<>();
        for (Tarefa t: listTarefa){
            if(t.isConcluida()){
                tarefaConluida.add(t);
            }
        }
        return tarefaConluida;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for (Tarefa t: listTarefa){
            if(!t.isConcluida()){
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }


    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t: listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        listTarefa.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4", false));
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 55");
        listaTarefas.exibirTarefas();

        System.out.println("Existem " + listaTarefas.contarTarefas() + " na lista de tarefas.");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
