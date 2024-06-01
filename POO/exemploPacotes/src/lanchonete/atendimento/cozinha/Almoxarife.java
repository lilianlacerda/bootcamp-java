package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	//Quando possui apenas o void, indica a ação é default (apenas as classes do mesmo pacote podem visualizar essa ação).
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//Controlar saída está privado, mas aqui quando formos entregar os ingredientes, podemos chamar esse método. 
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}