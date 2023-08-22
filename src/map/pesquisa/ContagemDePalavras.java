package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    private Map<String , Integer> palavras;

    public ContagemDePalavras() {
        this.palavras = new HashMap<>();
    }

    @Override
    public String toString() {
        return " " + palavras ;
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        } else {
            throw new RuntimeException("lista vazia!");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if(!palavras.isEmpty()){
            for (Map.Entry<String, Integer> p: palavras.entrySet()){
                contagemTotal += p.getValue();
            }
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraFrenquente = null;
        int maiorContagem = 0;
        if(!palavras.isEmpty()){
            for (Map.Entry<String, Integer> p: palavras.entrySet()){
                if(p.getValue() > maiorContagem){
                    maiorContagem = p.getValue();
                    palavraFrenquente = p.getKey();
                }
            }
        }
        return palavraFrenquente;
    }

    public static void main(String[] args) {
        ContagemDePalavras contagemPalavras = new ContagemDePalavras();
        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 8);
        contagemPalavras.adicionarPalavra("Palavra 3", 1);
        contagemPalavras.adicionarPalavra("Palavra 4", 6);
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.removerPalavra("Palavra 2");
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
