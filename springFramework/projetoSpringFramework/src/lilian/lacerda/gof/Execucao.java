package lilian.lacerda.gof;

import lilian.lacerda.gof.facade.Facade;
import lilian.lacerda.gof.singleton.ProjetoSingleton;
import lilian.lacerda.gof.strategy.Comportamento;
import lilian.lacerda.gof.strategy.ComportamentoAgressivo;
import lilian.lacerda.gof.strategy.ComportamentoDefensivo;
import lilian.lacerda.gof.strategy.ComportamentoNormal;
import lilian.lacerda.gof.strategy.Robo;

public class Execucao {

	public static void main(String[] args) {
		
		// Singleton
		
		ProjetoSingleton projeto = ProjetoSingleton.getInstance();
		System.out.println(projeto);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Lilian", "02614030");
	}
}
