package exemploPoo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("748596");
		//z400.ligar();
		
		Veiculo coringa = z400;
		
		coringa.ligar();
	}
}
/* Abstração e polimorfismo são conceitos inter-relacionados na POO. Abstração permite definir métodos em classes ou interfaces que não 
 * têm implementação específica, enquanto o polimorfismo permite que diferentes classes forneçam suas próprias implementações desses 
 * métodos abstratos.
 */