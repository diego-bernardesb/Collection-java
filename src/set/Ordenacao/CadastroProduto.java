package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd){
        produtoSet.add(new Produto(nome, cod, preco, qtd));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);//treeset cria um set ordenado
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> exibirPorPreco = new TreeSet<>(new ComparatorPorPreco());
        exibirPorPreco.addAll(produtoSet);
        return exibirPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto produtos = new CadastroProduto();

        produtos.adicionarProduto(1L, "lapis", 1.99d, 50);
        produtos.adicionarProduto(2L, "borracha", 3.99d, 10);
        produtos.adicionarProduto(2L, "clips", 4.99d, 20);
        produtos.adicionarProduto(3L, "grampeador", 19.99d, 5);
        produtos.adicionarProduto(4L, "grampos", 9.99d, 100);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }
}

