package desafioDioBanco;

import java.util.Scanner;

public class PainelOpcoes {
	
	public void MostrarOpcoes(boolean menuOpcoes, int opcao){
	
	Scanner scanner = new Scanner(System.in);
	
	menuOpcoes = true;
	
	while(menuOpcoes) {
		
		System.out.println("\n BEM VINDOS AO LILI'S BANK!!");
		
		System.out.println("Escolha o que quer fazer: ");
		System.out.println("1 - Criar uma conta dependente;");
		System.out.println("2 - Realizar um saque;");
		System.out.println("3 - Realizar um depósito;");
		System.out.println("4 - Realizar uma transferência;");
		System.out.println("0 - Sair; \n");
		opcao = scanner.nextInt();

			switch(opcao) {
				
				case 1: 
					
					System.out.println("Digite seu nome: ");
					String nome1 = scanner.next();
					Cliente cliente1 = new Cliente();
					cliente1.setNome(nome1);
					
					Conta conta1 = new ContaCorrente(cliente1);
					Conta poupanca1 = new ContaPoupanca(cliente1);
					
					System.out.println("Informações da conta: ");
					conta1.imprimirExtrato();
					poupanca1.imprimirExtrato();
					
					System.out.println("\n");
					
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
					
					int operacao1;
					System.out.println("Deseja Fazer outra operação? ");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					operacao1 = scanner.nextInt();
					
					if(operacao1 == 1) {
						break;
						
					}else if(operacao1 == 2){
						System.out.println("Saindo... Até a próxima!");
						menuOpcoes = false;
						
						break;
					}
					
				case 2: 
					
					System.out.println("Digite seu nome: ");
					String nome2 = scanner.next();
					Cliente cliente2 = new Cliente();
					cliente2.setNome(nome2);
					
					Conta conta2 = new ContaCorrente(cliente2);
					Conta poupanca2 = new ContaPoupanca(cliente2);
					
					System.out.println("Informações da conta: ");
					conta2.imprimirExtrato();
					poupanca2.imprimirExtrato();
					
					System.out.println("\n");
					
					System.out.println("Quanto gostaria de sacar? ");
					double saque = scanner.nextDouble();
					
					System.out.println("Selecione a conta: ");
					System.out.println("1 - Poupança; ");
					System.out.println("2 - Corrente.");
					int opcaoSaque = scanner.nextInt();
					
					if(opcaoSaque == 1) {
						
						poupanca2.sacar(saque);
						poupanca2.imprimirExtrato();
						System.out.println("\n");
						
					}else if(opcaoSaque == 2) {
						
						conta2.sacar(saque);
						conta2.imprimirExtrato();
						System.out.println("\n");
						
					}else {
						
						throw new RuntimeException("Opção inválida!");
					}
					
					int operacao2;
					System.out.println("Deseja Fazer outra operação? ");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					operacao2 = scanner.nextInt();
					
					if(operacao2 == 1) {
						break;
						
					}else if(operacao2 == 2){
						System.out.println("Saindo... Até a próxima!");
						menuOpcoes = false;
						
						break;
					}
					
				case 3:
					
					System.out.println("Digite seu nome: ");
					String nome3 = scanner.next();
					Cliente cliente3 = new Cliente();
					cliente3.setNome(nome3);
					
					Conta conta3 = new ContaCorrente(cliente3);
					Conta poupanca3 = new ContaPoupanca(cliente3);
					
					System.out.println("Informações da conta: ");
					conta3.imprimirExtrato();
					poupanca3.imprimirExtrato();
					
					System.out.println("\n");
					
					System.out.println("Quanto gostaria de depositar? ");
					double deposito = scanner.nextDouble();
					
					System.out.println("Selecione a conta: ");
					System.out.println("1 - Poupança; ");
					System.out.println("2 - Corrente.");
					int opcaoDeposito = scanner.nextInt();
					
					if(opcaoDeposito == 1) {
						
						poupanca3.depositar(deposito);
						poupanca3.imprimirExtrato();
						System.out.println("\n");
						
					}else if(opcaoDeposito == 2) {
						
						conta3.depositar(deposito);
						conta3.imprimirExtrato();
						System.out.println("\n");
						
					}else {
						
						throw new RuntimeException("Opção inválida!");
					}
					
					int operacao3;
					System.out.println("Deseja Fazer outra operação? ");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					operacao3 = scanner.nextInt();
					
					if(operacao3 == 1) {
						break;
						
					}else if(operacao3 == 2){
						System.out.println("Saindo... Até a próxima!");
						menuOpcoes = false;
						
						break;
					}
					
				case 4:
					
					System.out.println("Digite seu nome: ");
					String nome4 = scanner.next();
					Cliente cliente4 = new Cliente();
					cliente4.setNome(nome4);
					
					Conta conta4 = new ContaCorrente(cliente4);
					Conta poupanca4 = new ContaPoupanca(cliente4);
					
					System.out.println("Informações da conta: ");
					conta4.imprimirExtrato();
					poupanca4.imprimirExtrato();
					
					System.out.println("\n");
					
					System.out.println("Qual tipo de transferência deseja fazer? ");
					System.out.println("1 - Tranferir da conta corrente para a conta poupança;");
					System.out.println("2 - Tranferir da conta poupança para a conta corrente;");
					int tipoTransferencia = scanner.nextInt();
					
					System.out.println("Quanto deseja transferir?");
					double transferencia = scanner.nextDouble();
					
					if(tipoTransferencia == 1) {
						
						conta4.transferir(transferencia, poupanca4);
						conta4.imprimirExtrato();
						poupanca4.imprimirExtrato();
						System.out.println("\n");
						
					}else if(tipoTransferencia == 2) {
						
						poupanca4.transferir(transferencia, conta4);
						poupanca4.imprimirExtrato();
						conta4.imprimirExtrato();
						System.out.println("\n");
						
					}else {
						
						throw new RuntimeException("Opção inválida!");
					}
					
					int operacao4;
					System.out.println("Deseja Fazer outra operação? ");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					operacao4 = scanner.nextInt();
					
					if(operacao4 == 1) {
						break;
						
					}else if(operacao4 == 2){
						System.out.println("Saindo... Até a próxima!");
						menuOpcoes = false;
						
						break;
					}
					
				case 0:
					
					System.out.println("Saindo... Até a próxima!");
					menuOpcoes = false;
					
					break;
					
				default:
					
					System.out.println("Opção inválida, tente novamente.");
					
					break;
				}
			}
			
			scanner.close();
		}
}