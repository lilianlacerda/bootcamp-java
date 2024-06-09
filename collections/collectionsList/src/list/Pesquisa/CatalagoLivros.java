package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //Atributo
    private List<Livro> livroList;

    //Construtor
    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Método parra adicionar Livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorAutor;
    }

    //Pesquisar por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorIntervaloAnos;
    }

    //Pesquisar por título / se houver algum título repitido, ele mostra apenas o primeiro.
    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorTitulo;
    }

    //testando 
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
