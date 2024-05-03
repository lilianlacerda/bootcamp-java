package edu.lilian.operadores;

public class ExemploOperadores {

    public static void main(String[] args){

        //Exemplo concatenação
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.print(nomeCompleto + "\n");

        //Qual o resultado das expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        //Resultado: 31;

        concatenacao = 1+"1"+1+1;
        //Resultado: 1111;

        concatenacao = 1+"1"+1+"1";
        //Resultado: 1111;

        concatenacao = "1"+1+1+1;
        //Resultado: 1111

        concatenacao = "1"+(1+1+1);
        //Resultado: 13

        System.out.print(concatenacao);

    }
    
}

