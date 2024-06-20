package desafioDioBanco;

import java.util.List;
import java.util.Scanner;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas(){
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean menuOpcoes = true;
		
		
		System.out.println("\n BEM VINDOS AO LILI'S BANK!!");
		
		while(menuOpcoes) {
			
			System.out.println("Escolha o que quer fazer: ");
			System.out.println("1 - Criar uma conta dependente;");
			System.out.println("2 - Realizar um saque;");
			System.out.println("3 - Realizar um depósito;");
			System.out.println("4 - Realizar uma transferência;");
			System.out.println("0 - Sair; \n");
			int opcao = scanner.nextInt();
			
			System.out.println("Digite seu nome: ");
			String nome = scanner.next();
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			
			Conta conta = new ContaCorrente(cliente);
			Conta poupanca = new ContaPoupanca(cliente);
			
			System.out.println("Informações da conta: ");
			conta.imprimirExtrato();
			poupanca.imprimirExtrato();
			
			System.out.println("\n");
			
			switch(opcao) {
			
			case 1: 
				
				System.out.println("Digite o nome do dependente: ");
				String nomeDependente = scanner.next();
				Cliente clienteDependente = new Cliente();
				clienteDependente.setNome(nomeDependente);
				
				Conta contaDependente = new ContaCorrente(clienteDependente);
				Conta poupancaDependente = new ContaPoupanca(clienteDependente);
				
				contaDependente.imprimirExtrato();
				System.out.println("\n");
				poupancaDependente.imprimirExtrato();
				
				System.out.println("\n");
				
				break;
				
			case 2: 
				
				System.out.println("Quanto gostaria de sacar? ");
				double saque = scanner.nextDouble();
				
				System.out.println("Selecione a conta: ");
				System.out.println("1 - Poupança; ");
				System.out.println("2 - Corrente.");
				int opcaoSaque = scanner.nextInt();
				
				if(opcaoSaque == 1) {
					
					poupanca.sacar(saque);
					poupanca.imprimirExtrato();
					System.out.println("\n");
					
				}else if(opcaoSaque == 2) {
					
					conta.sacar(saque);
					conta.imprimirExtrato();
					System.out.println("\n");
					
				}else {
					
					throw new RuntimeException("Opção inválida!");
				}
				
				break;
				
			case 3:
				
				System.out.println("Quanto gostaria de depositar? ");
				double deposito = scanner.nextDouble();
				
				System.out.println("Selecione a conta: ");
				System.out.println("1 - Poupança; ");
				System.out.println("2 - Corrente.");
				int opcaoDeposito = scanner.nextInt();
				
				if(opcaoDeposito == 1) {
					
					poupanca.depositar(deposito);
					poupanca.imprimirExtrato();
					System.out.println("\n");
					
				}else if(opcaoDeposito == 2) {
					
					conta.depositar(deposito);
					conta.imprimirExtrato();
					System.out.println("\n");
					
				}else {
					
					throw new RuntimeException("Opção inválida!");
				}
				
				break;
				
			case 4:
				
				System.out.println("Qual tipo de transferência deseja fazer? ");
				System.out.println("1 - Tranferir da conta corrente para a conta poupança;");
				System.out.println("2 - Tranferir da conta poupança para a conta corrente;");
				int tipoTransferencia = scanner.nextInt();
				
				System.out.println("Quanto deseja transferir?");
				double transferencia = scanner.nextDouble();
				
				if(tipoTransferencia == 1) {
					
					conta.transferir(transferencia, poupanca);
					conta.imprimirExtrato();
					poupanca.imprimirExtrato();
					System.out.println("\n");
					
				}else if(tipoTransferencia == 2) {
					
					poupanca.transferir(transferencia, conta);
					poupanca.imprimirExtrato();
					conta.imprimirExtrato();
					System.out.println("\n");
					
				}else {
					
					throw new RuntimeException("Opção inválida!");
				}
				
				break;
				
			case 0:
				
				System.out.println("Saindo... Até a próxima!");
				menuOpcoes = false;
				
				break;
				
			default:
				
				System.out.println("Opção inválida, tente novamente.");
				
				break;
				
			}
		}
		
		
		
	}

}
