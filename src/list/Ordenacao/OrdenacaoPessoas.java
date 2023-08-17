package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new comparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenar = new OrdenacaoPessoas();

        ordenar.adicionarPessoa("pedro", 12 , 1.43);
        ordenar.adicionarPessoa("pablo", 24 , 1.63);
        ordenar.adicionarPessoa("carlos", 32 , 1.93);
        ordenar.adicionarPessoa("joao", 41 , 2.03);
        ordenar.adicionarPessoa("jose", 45 , 1.88);

        System.out.println(ordenar.ordenarPorAltura());
        System.out.println(ordenar.ordenarPorIdade());
    }

}
