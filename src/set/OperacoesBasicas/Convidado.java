package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int CodConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        CodConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodConvite() {
        return CodConvite;
    }

    public void setCodConvite(int codConvite) {
        CodConvite = codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodConvite=" + CodConvite +
                '}';
    }
}
