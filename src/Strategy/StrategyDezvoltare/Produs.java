package Strategy.StrategyDezvoltare;

public class Produs {
    private String numeProdus;
    private double pret;
    private int numarRecenzii;

    public Produs(String numeProdus, double pret, int numarRecenzii) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.numarRecenzii = numarRecenzii;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public double getPret() {
        return pret;
    }

    public int getNumarRecenzii() {
        return numarRecenzii;
    }

    @Override
    public String toString() {
        return "Produs [numeProdus=" + numeProdus + ", pret=" + pret + ", numarRecenzii=" + numarRecenzii + "]";
    }

}
