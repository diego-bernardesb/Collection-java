package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public Set<String> getConjuntoPalavras() {
        return conjuntoPalavras;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavras='" + conjuntoPalavras + '\'' +
                '}';
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!conjuntoPalavras.isEmpty()){
            conjuntoPalavras.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        boolean contemPalavra = false;
        if(conjuntoPalavras.contains(palavra)){
            System.out.println("A palavra " + palavra + " está presente no set");
        }else {
            System.out.println("Não contem a palavra no set");
        }
        return contemPalavra;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("palavra1");
        palavrasUnicas.adicionarPalavra("palavra2");
        palavrasUnicas.adicionarPalavra("palavra3");
        palavrasUnicas.adicionarPalavra("palavra4");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.verificarPalavra("palavra3");

        palavrasUnicas.removerPalavra("palavra2");

        palavrasUnicas.exibirPalavrasUnicas();

    }
}
