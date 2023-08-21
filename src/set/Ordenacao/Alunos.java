package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos  implements Comparable<Alunos> {
    private String nome;
    private int matricula;
    private double nota;

    public Alunos(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "[" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                ']';
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class comparaPorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
