package Flyweight.FlyweightClient;

public class Masa{
    private int nrMasa;
    private int nrPers;
    private String oraRezervare;

    public Masa(int nrMasa, int nrPers, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPers = nrPers;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPers() {
        return nrPers;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    @Override
    public String toString() {
        return "Masa [nrMasa=" + nrMasa + ", nrPers=" + nrPers + ", oraRezervare=" + oraRezervare + "]";
    }

}
