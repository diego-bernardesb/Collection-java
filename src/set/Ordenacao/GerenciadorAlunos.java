package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set <Alunos> gerenciarAlunos;

    public GerenciadorAlunos() {
        this.gerenciarAlunos = new HashSet<Alunos>();
    }

    private void adicionarAluno(String nome, int matricula, double nota){
        gerenciarAlunos.add(new Alunos(nome, matricula, nota));
    }

    private void removerAluno(int matricula){
        Alunos alunoParaRemover = null;
        for (Alunos a : gerenciarAlunos){
            if(a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        gerenciarAlunos.remove(alunoParaRemover);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(gerenciarAlunos);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> exibirPorNota = new TreeSet<>(new comparaPorNota());
        exibirPorNota.addAll(gerenciarAlunos);
        return exibirPorNota;
    }

    public void exibirAlunos(){
        System.out.println(gerenciarAlunos);;
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("matheus", 123, 8.9d);
        alunos.adicionarAluno("marcus", 122, 6.3d);
        alunos.adicionarAluno("fabio", 124, 4.3d);
        alunos.adicionarAluno("carlos", 125, 6.0d);
        alunos.adicionarAluno("fernanda", 126, 8.0d);
        alunos.adicionarAluno("isabela", 127, 8.3d);

        alunos.exibirAlunos();
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());

        alunos.removerAluno(122);
        alunos.exibirAlunos();
    }
}
