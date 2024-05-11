package Composite.CompositeRestaurant;

public class Bauturi implements INod {
    private String denumire;
    private int pret;

    public Bauturi(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getElement(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    

    
}
