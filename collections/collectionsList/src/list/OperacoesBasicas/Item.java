package list.OperacoesBasicas;

public class Item {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtores
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    //Método para fornecer uma representação textual do objeto (imprimir de forma mais legível).
    //"Item{" +
    //                "nome='" + nome + '\'' +
    //                ", preco=" + preco +
    //                ", quantidade=" + quantidade +
    //                '}';
    public String toString(){

        return "Iten{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
