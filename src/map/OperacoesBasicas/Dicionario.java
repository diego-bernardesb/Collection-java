package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        } else {
            throw new RuntimeException("lista vazia!");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquinaPalavra = null;
        if(!dicionario.isEmpty()){
            pesquinaPalavra = dicionario.get(palavra);
        } else {
            throw new RuntimeException("lista vazia!");
        }
        return pesquinaPalavra;
    }

    public static void main(String[] args) {
        Dicionario palavras = new Dicionario();

        palavras.adicionarPalavra("tele", "visão");
        palavras.adicionarPalavra("ra", "dio");
        palavras.adicionarPalavra("telefo", "nema");
        palavras.adicionarPalavra("video", "game");

        palavras.exibirPalavras();

        System.out.println(palavras.pesquisarPorPalavra("tele"));

        palavras.removerPalavra("video");
        palavras.exibirPalavras();

    }

}
