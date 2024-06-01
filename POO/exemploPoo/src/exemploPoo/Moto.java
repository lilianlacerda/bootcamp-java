package exemploPoo;

public class Moto extends Veiculo {

	@Override
	public void ligar() {
		System.out.println("Moto Ligada");
		
	}
}

/* 
 * O extends é quando temos alguma Herança e gostariamos de inserir no objeto. Por exemplo, tanto carro quanto moto possui o chassi, neste caso
 * criamos o veiculo com a String chassi. Colocamos apenas o extends Veiculo para indicar que é uma herança
 */
