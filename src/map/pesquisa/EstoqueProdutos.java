package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco){
        produtosMap.put(cod , new Produtos(nome,qtd , preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!produtosMap.isEmpty()){
            for(Produtos p: produtosMap.values()){//.values para acessar o atributo do obj
                valorTotalEstoque += p.getPreco() * p.getQtd();
            }
        }
        return valorTotalEstoque;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()){
            for (Produtos p : produtosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato(){
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtosMap.isEmpty()){
            for (Produtos p : produtosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produtos maiorQtdEstoque = null;
        double maiorValorPorQtd = 0d;
        if(!produtosMap.isEmpty()){
            for (Map.Entry<Long, Produtos> p : produtosMap.entrySet()){
                double valorProdutoEstoque = p.getValue().getPreco() * p.getValue().getQtd();
                if(valorProdutoEstoque > maiorValorPorQtd){
                    maiorValorPorQtd = valorProdutoEstoque;
                    maiorQtdEstoque = p.getValue();
                }
            }
        }
        return maiorQtdEstoque;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
//        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
        estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
        estoque.adicionarProduto(4L, "Produto D", 2, 4.0);

        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
