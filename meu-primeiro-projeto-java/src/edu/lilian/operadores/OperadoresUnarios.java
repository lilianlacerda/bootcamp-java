package edu.lilian.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        //Fazendo apenas isso, ele não converte. Porque os unários são operadores aritiméticos (- com + = -)
        numero = + numero;

        //para tornar o número positivo;
        numero = numero * -1;

        System.out.println(numero);

        int numero2 = 5;

        //numero2 = numero2 + 1;
        //numero2 ++;

        /*
            Algo importante é que o incremento e o decremento é que ele tem algumas regrinhas. Se colocarmos no System.out.println, 
            ele vai primeiro imprimir e depois incrementar ou decrementar. Ex: System.out.println(numero2++)
            Para funcionar, você pode colocar a incrementação ou a decrementação na frente: System.out.println(++numero2);
         */ 
        System.out.println(++numero2);

        boolean variavel = true;

        //o símbolo ! indica que eu estou negadno o valor da variável booleana
        System.out.println(!variavel);

        //dessa forma conseguimos inverter o valor da veriável booleana. 
        variavel = !variavel;

        System.out.println(variavel);
    }
}