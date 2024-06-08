package list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getters
    public String getDescricao() {

        return descricao;
    }

    // Método para fornecer uma representação textual do objeto. (imprimir de forma mais legível)
    @Override
    public String toString() {
        return descricao;
    }
}
