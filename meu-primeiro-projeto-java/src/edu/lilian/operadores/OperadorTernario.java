package edu.lilian.operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        /*
        Exmplo de uma condição
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";  
            
        System.out.println(resultado);
        */

        //Exemplo de ternário
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        
    }
}