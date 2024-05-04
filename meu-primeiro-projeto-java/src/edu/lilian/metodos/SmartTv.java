package edu.lilian.metodos;

public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    //métodos para ligar ou desligar a TV;
    public void ligar(){
        ligada =true;
    }

    public void desligar(){
        ligada=false;
    }

    //Métodos para aumentar ou diminuir o volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }

    //métodos para trocar de canal;
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: "+canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: "+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: "+canal);
    }
}