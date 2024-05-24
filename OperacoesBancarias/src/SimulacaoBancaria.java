import java.util.Scanner;
public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        boolean continuar = true;

        while (continuar){
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if(saque <= saldo ){
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }else {
                        System.out.printf("Saldo insuficinete");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    System.out.printf("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.printf("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
