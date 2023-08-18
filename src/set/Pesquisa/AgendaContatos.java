package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
       Set<Contato> contatoNomes = new HashSet<>();
       for (Contato c : conjuntoContatos){
           if(c.getNome().startsWith(nome)){ //trazer todos os contatos que comecem com o nome buscado
               contatoNomes.add(c);
           }
       }
       return contatoNomes;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: conjuntoContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("camila", 2222);
        agendaContatos.adicionarContato("camila", 1111);
        agendaContatos.adicionarContato("camila silva", 3214);
        agendaContatos.adicionarContato("camila fernandes", 4353);
        agendaContatos.adicionarContato("paulo", 221231222);
        agendaContatos.adicionarContato("pedro", 2245322);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("camila"));

        System.out.println("contato atualizado: " + agendaContatos.atualizarNumeroContato("paulo", 12345));

        agendaContatos.exibirContatos();



    }
}
