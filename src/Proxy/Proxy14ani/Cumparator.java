package Proxy.Proxy14ani;

public class Cumparator {
    private int varsta;
    private String nume;

    public Cumparator(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Cumparator [varsta=" + varsta + ", nume=" + nume + "]";
    }

}
