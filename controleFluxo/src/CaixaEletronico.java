public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        /*
            Se valor solicitado for menor que o saldo,
            ele vai subtrair o valor do saldo e imprimir
            o saldo atualizado. 
            Caso o valor solicitado seja maior que o saldo,
            Nada acontece (possivelmente por causa do Else). 
        */ 
        /* 
            Se dentro do if/else tiver mais de uma instrução,
            é preciso criar um bloco para o fluxo com {}

        */
        if(valorSolicitado < saldo){
        double saldoAtualizado = saldo - valorSolicitado;
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Seu saldo atual é: "+saldoAtualizado+" R$");

        }else{
            System.out.println("Saldo Insuficiente");
            System.out.println("Seu saldo é: "+saldo+" R$");
        }
        
    }
}