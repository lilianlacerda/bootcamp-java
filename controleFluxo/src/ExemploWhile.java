//Importando classe para simular valores aleatórios 
//(não é um requisito para trabalhar com While);
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = valorAleatório();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor: "+valorDoce+" Adicionando no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        
    }


    /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
    */
    private static double valorAleatório(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
