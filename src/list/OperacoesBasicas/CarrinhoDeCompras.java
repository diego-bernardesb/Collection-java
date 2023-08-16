package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void  adicionarItem(String nome,int quantidade, double preco){
      itensList.add(new Item(nome, quantidade, preco));
    }

  public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();

      for (Item i: itensList ) {
          if(i.getNome().equalsIgnoreCase(nome)){
              removerItens.add(i);
          }
      }
      itensList.removeAll(removerItens);
  }

  public double calcularValorTotal(){
     double valorTotal = 0d;
     if(!itensList.isEmpty()){
         for (Item i: itensList) {
             double valorItem = i.getPreco() * i.getQtd();
             valorTotal += valorItem;
         }
         return valorTotal;
     } else {
         throw new RuntimeException("Não possui valor para calcular.");
     }
  }
  public void exibirItens(){
      if(!itensList.isEmpty()){
        System.out.println(itensList);
      }else {
          System.out.println("Não possui nenhum item no carrinho de compras.");
      }
  }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("livro", 3, 35d);
        carrinho.adicionarItem("radio", 1, 335d);
        carrinho.adicionarItem("pilhas", 4, 10d);
        carrinho.adicionarItem("cabo de energia", 1, 20d);

        carrinho.calcularValorTotal();

        System.out.println("O valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("livro");

        carrinho.exibirItens();


    }
}
