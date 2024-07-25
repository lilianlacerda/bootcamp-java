package lilian.lacerda.gof.singleton;

public class ProjetoSingleton {
	
	private static class InstanceHolder{
	
		public static ProjetoSingleton instancia = new ProjetoSingleton();
	}
	
	private ProjetoSingleton() {
		super();
	}
	
	public static ProjetoSingleton getInstance() {
		return InstanceHolder.instancia;
	}
}