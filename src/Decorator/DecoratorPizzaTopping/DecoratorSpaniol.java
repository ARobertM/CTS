package Decorator.DecoratorPizzaTopping;

public class DecoratorSpaniol extends AdecoratorProdus {


    public DecoratorSpaniol(IProdus produs) {
        super(produs);
        this.produs = produs;
    }

    @Override
    public void afisareProdus() {
        System.out.println("Dracula");
        super.afisareProdus();
    }

   
    
}
