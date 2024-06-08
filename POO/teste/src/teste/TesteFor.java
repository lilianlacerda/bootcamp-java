package teste;

public class TesteFor {
	public static void main(String[] args) {
		
		int anos []= {2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024};
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        for(int i = 0; i < anos.length; i++) {
        	System.out.println(" \n Lista do ano de " + anos[i]);
        	
        	for(int j = 0; j < meses.length; j++) {
            	System.out.println("Essa é a lista do mês: " + meses[j]);
        	}
        }
	}
}