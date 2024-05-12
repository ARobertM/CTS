package Decorator.DecoratorClient;


public class Decorator extends ARezervare{

    protected ARezervare aRezervare;
    
    public Decorator(ARezervare aRezervare) {
        this.aRezervare = aRezervare;
    }

    @Override
    public String detalii() {
        return aRezervare.detalii();
    }
    
}
