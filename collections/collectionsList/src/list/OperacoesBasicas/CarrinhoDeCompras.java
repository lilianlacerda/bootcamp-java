package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Declarando um atributo privado chamado itemlist que é do tipo List<Item>
    private List<Item> itemlist;

    //Construtor (é um método especial que é chamado quando uma nova instância da classe é criada.)
    //Ele inicializa o itemlist como uma nova instância de ArrayList
    public CarrinhoDeCompras(){
        this.itemlist = new ArrayList<>();
    }

    //Método para Adicionar Itens - Cria um novo objeto Item com os parâmetros fornecidos e o adiciona à lista itemlist.
    public void adicionarItem(String nome, double preco, int quantidade){
        itemlist.add(new Item(nome, preco, quantidade));
    }

    /*
        Método para Remover Itens
        if(!itemlist.isEmpty()) - Verifica se a lista não está vazia.
        List<Item> itensParaRemover = new ArrayList<>(); -  Cria uma nova lista para armazenar os itens que serão removidos.
        for (Item i : itemlist) - Itera sobre cada item na lista itemlist.
        if (i.getNome().equalsIgnoreCase(nome)) - Verifica se o nome do item coincide (ignorando maiúsculas/minúsculas) com o nome fornecido.
        itensParaRemover.add(i); - Adiciona o item à lista itensParaRemover se os nomes coincidirem.
        itemlist.removeAll(itensParaRemover); - Remove todos os itens na lista itensParaRemover da lista itemlist.
        else { throw new RuntimeException("A Lista está vazia!"); } -  Lança uma exceção se a lista estiver vazia.
     */
    public void removerItem(String nome){
        if(!itemlist.isEmpty()) {
            List<Item> itensParaRemover = new ArrayList<>();
            for (Item i : itemlist) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemlist.removeAll(itensParaRemover);
        }else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    /*
        Método para Calcular o Valor Total
        double valorTotal = 0d; -  Inicializa a variável valorTotal com zero.
        double valorItem = item.getPreco() * item.getQuantidade(); -  Calcula o valor total para um item específico (preço multiplicado pela quantidade).
        valorTotal += valorItem; -  Adiciona o valor do item ao total.
        return valorTotal; -  Retorna o valor total calculado.
     */
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemlist.isEmpty()){
            for(Item item : itemlist){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    //Método para Exibir Itens
    //System.out.println(itemlist); -  Imprime a lista de itens.
    public void exibirItens(){
        if(!itemlist.isEmpty()){
            System.out.println(itemlist);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Sobrescrita do Método toString()
    //public String toString() -  Declara um método toString() que retorna uma representação em string do objeto.
    //return "CarrinhoDeCompras{" + "itens=" + itemlist + '}';: Retorna uma string que representa o objeto CarrinhoDeCompras, incluindo a lista de itens.
    @Override
    public String   toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemlist +
                '}';
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Caneta", 2d, 6);
        carrinhoDeCompras.adicionarItem("Tesoura", 4d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 15d, 3);

        //Exibindo Itens do carrinho:
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho:
        carrinhoDeCompras.removerItem("Tesoura");

        //Exibir os itens atualizados no carrinho:
        carrinhoDeCompras.exibirItens();

        //Calculando e exibindo o valor total dos itens do carrinho:
        System.out.println("O valor total da compra é: " +carrinhoDeCompras.calcularValorTotal());
    }
}
