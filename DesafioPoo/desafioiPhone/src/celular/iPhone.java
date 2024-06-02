package celular;

import java.util.Scanner;

import apps.Musica;
import apps.SistemaOperacional;
import apps.Telefone;
import apps.Internet;

public class iPhone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SistemaOperacional so = new SistemaOperacional();
		
		System.out.println("\n BEM VINDO AO MENU DE OPÇÕES! \n");
		
		System.out.println("SELECIONE A OPÇÃO QUE DESEJA: \n");
		
		System.out.println("1 - Para acessar o iPod");
		System.out.println("2 - Para acessar o Telefone");
		System.out.println("3 - Para acessar o navegador de Internet");
		System.out.println("0 - Para sair");
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1: {
			Musica musica = so;
			
			System.out.println("O que deseja fazer? \n");
			System.out.println("1 - Selecionar uma música");
			System.out.println("2 - Dar play na música");
			System.out.println("3 - Pausar a música");
			System.out.println("0 - Para sair");
			int opcaoMusica = scanner.nextInt();
			
			if(opcaoMusica == 1) {
				System.out.println("Digite a Música e o Artista: ");
				musica.selecionarMusica(scanner.next(), scanner.next());
				break;
				
			}else if(opcaoMusica == 2) {
				musica.tocar();
				
			}else if(opcaoMusica == 3) {
				musica.pausar();
				
			}else if(opcaoMusica == 0) {
				System.out.println("Operação finalizada");
				
			}else {
				System.out.println("Opção Inválida");
			}
		break;	
		} 
		
		case 2: {
			Telefone telefone = so;
			
			System.out.println("O que deseja fazer? \n");
			System.out.println("1 - Atender a Ligação");
			System.out.println("2 - Encerrar a ligação");
			System.out.println("3 - Fazer uma ligação");
			System.out.println("4 - Iniciar um correio de voz");
			System.out.println("0 - Para sair");
			int opcaoTelefone = scanner.nextInt();
			
			if(opcaoTelefone == 1) {
				telefone.atender();
				
			}else if(opcaoTelefone == 2) {
				telefone.encerrarLigacao();
				
			}else if(opcaoTelefone == 3) {
				System.out.println("Digite o número de telefone: ");
				telefone.ligar(scanner.next());
				
			}else if(opcaoTelefone == 4) {
				telefone.iniciarCorreioVoz();
				
			}else if(opcaoTelefone == 0) {
				System.out.println("Operação finalizada");
				
			}else {
				System.out.println("Opção inválida");
			}
		break;
		}
		
		case 3: {
			Internet internet = so;
			
			System.out.println("O que deseja fazer? \n");
			System.out.println("1 - Adcionar uma nova aba");
			System.out.println("2 - Exibir uma página");
			System.out.println("3 - Atualizar a página");
			System.out.println("0 - Para sair");
			int opcaoInternet = scanner.nextInt();
			
			if(opcaoInternet == 1) {
				internet.adcionarNovaAba();
				
			}else if(opcaoInternet == 2) {
				System.out.println("Digite a página que deseja exibir: ");
				internet.exibirPagina(scanner.next());
				
			}else if(opcaoInternet == 3) {
				internet.atualizarPagina();
				
			}else if(opcaoInternet == 0) {
				System.out.println("Operação finalizada");
				
			}else {
				System.out.println("Opção Inválida");
			}
		break;
		}
		default:
			System.out.println("Operação finalizada");
		}
		
		scanner.close();
		
	}

}
