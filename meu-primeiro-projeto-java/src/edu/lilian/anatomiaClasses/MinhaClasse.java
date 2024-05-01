package edu.lilian.anatomiaClasses;

public class MinhaClasse {
    public static void main(String [] args){
        //TIPOS DE VARIÁVEIS 
        String meuNome = "Lilian";
        int anoFabricacao = 2024;
        boolean verdadeira = false;
        anoFabricacao = 2018;
        String primeiroNome = "Lilian";
        String segundoNome = "Raiany";  

        //Nessa string puxamos o método abaixo e deixaos como o valor dela.  
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome + "\n");

        System.out.print(nomeCompleto + "\n");  
        System.out.print(meuNome + "\n");
        System.out.print(anoFabricacao + "\n");
        System.out.print(verdadeira + "\n");
    }

    //MÉTODOS | Esse método exige 2 parâmetros, primeiroNome e segundoNome
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    

}
