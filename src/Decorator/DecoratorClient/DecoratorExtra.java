package Decorator.DecoratorClient;

import Flyweight.FlyweightReteta.main;

public class DecoratorExtra extends Decorator {
    private boolean areMancare;
    private boolean areScaun;
    private boolean areBautura;
    private boolean areMuzica;
    private boolean areGen;

    public DecoratorExtra(ARezervare aRezervare, boolean areMancare, boolean areScaun, boolean areBautura,
            boolean areMuzica, boolean areGen) {
        super(aRezervare);
        this.areMancare = areMancare;
        this.areScaun = areScaun;
        this.areBautura = areBautura;
        this.areMuzica = areMuzica;
        this.areGen = areGen;
    }

    @Override
    public String detalii() {
       String detalii = super.detalii();
       if(areMancare){
            detalii += " + mancare";
       }
       if(areBautura){
            detalii += " + bautura";
       }
       if(areGen){
            detalii += " + gen";
       }
       if(areMuzica){
            detalii += " + muzica";
       }
       if(areScaun){
            detalii += " + scaun";
       }
       return detalii;
    }

    
    
}
