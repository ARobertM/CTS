package Composite.CompositeMeniulZilei;

public class Produs implements INod {
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        super();
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public void addElement(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getElement(int index) {
        throw new UnsupportedOperationException();
    }

    
}
