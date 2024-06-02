package apps;

public class SistemaOperacional implements Musica, Telefone, Internet {
	
	//MUSICA
	public void selecionarMusica(String nomeMusica, String nomeArtista) {
		System.out.println("SELECIONANDO A MÚSICA " + nomeMusica + " DO ARTISTA " + nomeArtista);
		
	}
	public void tocar() {
		System.out.println("TOCANDO A MÚSICA");
		
	}
	public void pausar() {
		System.out.println("PAUSANDO A MÚSICA");
		
	}
	
	//TELEFONE
	public void atender() {
		System.out.println("ATENDENDO A LIGAÇÃO");
		
	}
	public void encerrarLigacao() {
		System.out.println("LIGAÇÃO ENCERRADA");
		
	}
	public void ligar(String numeroTelefone) {
		System.out.println("LIGANDO PARA " + numeroTelefone);
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("CHAMADA NÃO ATENDIDA. INICIANDO O CORREIO DE VOZ");
		
	}
	
	//INTERNET
	public void adcionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
		
	}
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO A PÁGINA " +url);
		
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
		
	}
}
