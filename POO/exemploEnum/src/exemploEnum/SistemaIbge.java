package exemploEnum;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " - IBGE: " + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		
		System.out.println(eb.getNome());
	}
}
