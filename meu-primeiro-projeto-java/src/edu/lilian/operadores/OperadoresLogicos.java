package edu.lilian.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        //esse é o E 
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        //esse é o OU
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }

        //para criar umas expressões da forma abaixo, você terá um resultado booleano; 
        if(condicao1 && ( 7 > 4) ){
            System.out.println("Isso é verdade!");
        }else{
            System.out.println("Isso é mentira");
        }

        System.out.println("Fim");
    }
    
}