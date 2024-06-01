package exemploPoo;

public abstract class Veiculo {
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar();
}

/*
 * A abstração é um dos pilares da Programação Orientada a Objetos (POO). Ela permite definir métodos que especificam o que uma classe 
 * deve fazer, sem detalhar como isso será feito. Em uma classe abstrata, os métodos abstratos são declarados sem implementação, 
 * indicando que as subclasses devem fornecer a implementação específica desses métodos. 
 */
