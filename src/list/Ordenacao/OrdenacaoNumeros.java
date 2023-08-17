package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return ""+numeros;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaCrescente = this.numeros;
        Collections.sort(listaCrescente);

        return listaCrescente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDecrescente = this.numeros;
        Collections.sort(listaDecrescente, Collections.reverseOrder());

        return listaDecrescente;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros orderNum = new OrdenacaoNumeros();

        orderNum.adicionarNumero(4);
        orderNum.adicionarNumero(5);
        orderNum.adicionarNumero(2);
        orderNum.adicionarNumero(3);

        System.out.println(orderNum);
        System.out.println(orderNum.ordenarAscendente());
        System.out.println(orderNum.ordenarDescendente());
    }
}
