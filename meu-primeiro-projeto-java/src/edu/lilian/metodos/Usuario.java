package edu.lilian.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Volume Atual: "+smartTv.volume);
        System.out.println("Canal Atual: "+smartTv.canal+"\n");
        
        //status da TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? "+smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? "+smartTv.ligada+"\n");

        //Volume da TV
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: "+smartTv.volume+"\n");

        //canal da TV
        smartTv.mudarCanal(13);
        System.out.println("\"Novo Status -> Canal atual: "+smartTv.canal);
        
    }
    
}
