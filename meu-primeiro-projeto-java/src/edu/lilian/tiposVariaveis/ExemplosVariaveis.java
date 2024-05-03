package edu.lilian.tiposVariaveis;

public class ExemplosVariaveis{

    public static void main(String[] args) throws Exception {
        double salaraioMinimo = 2500.33;
        System.out.print(salaraioMinimo + "\n");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /*
        neste caso como não é possível converter um número inteiro para short, o java sugere fazer um cast -> (short)
        *cast - Ele converte de um tipo mais abrangente para um tipo mais espeífico  porque é o tipo correspondente. Neste exemplo, ele converteu pra short
        */
        short numeroCurto2 = (short) numeroNormal;
        System.out.print(numeroCurto2 + "\n");


        //Variáveis     
        int numero = 5;
        numero = 10;
        System.out.print(numero + "\n");

        //Contantes
        //Se apenas colocar em caixa alta, não é o suficiente, precisa ter o "final" sempre que declarar constantes.
        double VALOR_DE_PI = 10.14; //não é o suficiente
        VALOR_DE_PI = 15.74;
        System.out.print(VALOR_DE_PI + "\n");


        final double VALOR_DE_PI_CORRETO = 3.14; //CORRETO!
        System.out.print(VALOR_DE_PI_CORRETO + "\n"); 

        
    }
}