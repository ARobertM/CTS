package Facade.FacadeRestaurant;

public class Masa {
    private int nrMasa;
    private boolean suntServetele;

    public Masa(int nrMasa,boolean suntServetele) {
        this.nrMasa = nrMasa;
        this.suntServetele = suntServetele;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isSuntServetele() {
        return suntServetele;
    }
    
}
