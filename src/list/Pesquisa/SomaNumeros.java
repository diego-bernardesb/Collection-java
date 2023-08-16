package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public List<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }


    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public Integer calcularSoma(){
        Integer valorCalculado = 0;
        if(!listaDeNumeros.isEmpty()){
            for (Integer ln: listaDeNumeros){
                int valorInt = ln;
                valorCalculado += valorInt;
            }
        }
        return valorCalculado;
    }

    public  Integer  encontrarMaiorNumero(){
        Integer maiorValor = Integer.MIN_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for(Integer ln: listaDeNumeros){
                if(ln >= maiorValor){
                    maiorValor = ln;
                }
            }
        }else {
            throw new RuntimeException("Lista está vazia!");
        }
        return maiorValor;
    }
    public Integer encontrarMenorNumero(){
        Integer menorValor = Integer.MAX_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for(Integer ln: listaDeNumeros){
                if(ln <= menorValor){
                    menorValor = ln;
                }
            }
        }else {
            throw new RuntimeException("Lista está vazia!");
        }
        return menorValor;
    }
    public void exibirNumeros(){
        if(!listaDeNumeros.isEmpty()){
            System.out.println(listaDeNumeros);
        }else {
            System.out.println("Lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaDeNumeros=" + listaDeNumeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(1111);
        numeros.adicionarNumero(123);

        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

        numeros.exibirNumeros();
    }


}
