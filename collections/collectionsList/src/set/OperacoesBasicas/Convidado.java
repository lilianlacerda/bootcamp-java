package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;

    //Contrutor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Método get para os atributos
    public String getNome() {
        return nome;
    }

    //Método get para os atributos
    public int getCodigoConvite() {
        return codigoConvite;
    }

    //Comparação através do código do convite para evitar duplicidade!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    //Método toString para aparecer as informações dos atributos
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
