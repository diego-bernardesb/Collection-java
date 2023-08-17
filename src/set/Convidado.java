package set;

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
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodConvite=" + CodConvite +
                '}';
    }
}
