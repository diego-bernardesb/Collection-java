package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Carlos", 1234);
        convidados.adicionarConvidado("Zarlos", 1235);
        convidados.adicionarConvidado("Marlos", 1235);
        convidados.adicionarConvidado("Darlos", 1236);

        convidados.exibirConvidados();
        convidados.contarConvidados();

//        convidados.removerConvidadoPorCodigoConvite(4565);
//        convidados.contarConvidados();
//        convidados.exibirConvidados();
    }
}
