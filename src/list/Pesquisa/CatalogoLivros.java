package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listDeLivros = new ArrayList<>();

    public CatalogoLivros() {
        this.listDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();

        if(!listDeLivros.isEmpty()){
            for (Livro l : listDeLivros ) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalo = new ArrayList<>();
        if(!listDeLivros.isEmpty()){
            for (Livro l : listDeLivros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervalo.add(l);
                }
            }
        }
        return  livroPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listDeLivros.isEmpty()){
            for (Livro l : listDeLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("os 3 porquinhos","porquinho n1", 1977 );
        livros.adicionarLivro("chapelzinho vermelho","vovozinha", 1942 );
        livros.adicionarLivro("chapelzinho amarelo","vovozinha", 1942 );
        livros.adicionarLivro("peter pan","capitão gancho", 1989 );
        livros.adicionarLivro("alice no pais das maravilhas","leão", 1877 );

        System.out.println(livros.pesquisarPorAutor("vovozinha"));
        System.out.println(livros.pesquisarPorTitulo("chapelzinho vermelho"));
        System.out.println(livros.pesquisarPorIntervaloAnos(1940,1988));

    }
}
