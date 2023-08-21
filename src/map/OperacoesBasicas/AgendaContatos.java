package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else {
            throw new RuntimeException("lista vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer pesquisaPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            pesquisaPorNome = agendaContatoMap.get(nome);
        }
        return pesquisaPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

//        contatos.adicionarContato("Diego", 12345678);
//        contatos.adicionarContato("Diego", 11111111);
//        contatos.adicionarContato("Ana", 134512345);
//        contatos.adicionarContato("Pedro", 234235521);
//        contatos.adicionarContato("Joana", 234234223);
//
//        contatos.exibirContatos();
//        System.out.println("O contato "+ contatos.pesquisarPorNome("Diego"));

        contatos.removerContato("Diego");

//        contatos.exibirContatos();
    }
}
