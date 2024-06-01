package exemploPoo;

public class Carro  extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo câmbio em P");
	}
}

/* 
 * O encapsulamento serve para "esconder" algumas ações que o usuário não precisa ver. Exemplo, esses métodos que estão como "private", o condutor
 * não precisa ver. 
 */
