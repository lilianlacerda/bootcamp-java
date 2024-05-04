package edu.lilian.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        //Verifica se são iguais;
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igaul a numeroDois? "+ simNao);

        //verifica se são diferentes;
        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente a numeroDois? "+ simNao);

        //verifica se um é maior que o outro; 
        simNao = numero1 > numero2;
        System.out.println("NumeroUm é igaul a numeroDois? "+ simNao);

        //verifica se um número é maior ou igual o outro;
        simNao = numero1 >= numero2;
        System.out.println("NumeroUm é maior ou igual a numeroDois? "+ simNao);

        //verifica se um número é menor que o outro; 
        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor a numeroDois? "+ simNao);

        //verifica se um núemro é menor ou igual o outro; 
        simNao = numero1 <= numero2;
    
        System.out.println("NumeroUm é menor ou igual a numeroDois? "+ simNao);

        String nomeUm = "LILIAN";
        String nomeDois = new String("LILIAN");

        //geralmente quando estivermos falando de objeto, utilizamos o .equals
        System.out.println(nomeUm.equals(nomeDois));


    }
    
}
