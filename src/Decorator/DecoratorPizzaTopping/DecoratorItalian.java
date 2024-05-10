package Decorator.DecoratorPizzaTopping;

public class DecoratorItalian extends AdecoratorProdus {


    public DecoratorItalian(IProdus produs) {
        super(produs);
        this.produs = produs;
    }

    @Override
    public void afisareProdus() {
        System.out.println("Scula");
        super.afisareProdus();
    }

   
    
}
