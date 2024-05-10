package Composite.CompositeMZ;

public class Produs implements INod {
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void add(INod iNod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getElement(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        // TODO Auto-generated method stub
        return this.pret;
    }

    @Override
    public void remove(INod iNod) {
        throw new UnsupportedOperationException();
    }
}
