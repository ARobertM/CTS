package Decorator.DecoratorPizzaTopping;

public abstract class AdecoratorProdus implements IProdus {

    protected IProdus produs;
    
    public AdecoratorProdus(IProdus produs) {
        this.produs = produs;
    }

    @Override
    public void afisareProdus() {
       this.produs.afisareProdus();
    }

    @Override
    public String getDenumire() {
        return this.produs.getDenumire();
    }

    @Override
    public int getPret() {
        return this.produs.getPret();
    }

    @Override
    public String getSpecialitate() {
        return this.produs.getSpecialitate();
    }
    
}
