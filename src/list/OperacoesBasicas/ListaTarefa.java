package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listTarefa;

    public ListaTarefa() {
        this.listTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listTarefa.add(new Tarefa(descricao));
    }

  public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
      for (Tarefa t : listTarefa) {
          if(t.getDescricao().equals(descricao)){
              tarefasParaRemover.add(t);
          }
      }
      listTarefa.removeAll(tarefasParaRemover);
  }
  public int obterNumeroTotalTarefas(){
        return listTarefa.size();
  }


  public void obterDescricoesTarefas(){
      System.out.println(listTarefa);
  }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        System.out.println("quantidade da lista de tarefas: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 2");
        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 3");
        lista.adicionarTarefa("tarefa 4");
        lista.adicionarTarefa("tarefa 5");
        System.out.println("quantidade da lista de tarefas: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("tarefa 1");

        lista.obterDescricoesTarefas();
    }
}
