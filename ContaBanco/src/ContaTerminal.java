import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo! Crie a sua conta no LilianBank!"+"\n" );

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite o número da agência (com o dígito): ");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá! "+nome+" "+sobrenome+", obrigada por criar uma conta em nosso banco, sua agência é "+agencia+", sua conta é "+conta+" e seu saldo de "+saldo+"R$ já está disponível para saque! Aproveite!");

        scanner.close();
    }

    
}
