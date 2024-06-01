package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//Somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	//mais um método que todos os filhos deverão implementar
	protected void salvarHistoricoMensagem() {
		System.out.println("Realizando o backup da conversa");
	}
}
