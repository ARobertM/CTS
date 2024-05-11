package Flyweight.FlywightCamera;

public class Inventar implements IPrintare{
    private int nrProsop;
    private int nrCearceafuri;
    private int nrPerne;
    private int nrUmerase;

    public Inventar(int nrProsop, int nrCearceafuri, int nrPerne, int nrUmerase) {
        this.nrProsop = nrProsop;
        this.nrCearceafuri = nrCearceafuri;
        this.nrPerne = nrPerne;
        this.nrUmerase = nrUmerase;
    }

    public int getNrProsop() {
        return nrProsop;
    }

    public int getNrCearceafuri() {
        return nrCearceafuri;
    }

    public int getNrPerne() {
        return nrPerne;
    }

    public int getNrUmerase() {
        return nrUmerase;
    }

    @Override
    public void tiparesteDetaliiCamera(Camera c) {
        System.out.println("Camera "+ c.getNrCamera() + " are clientul " + c.getNumeClient());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Inventar [nrProsop=" + nrProsop + ", nrCearceafuri=" + nrCearceafuri + ", nrPerne=" + nrPerne
                + ", nrUmerase=" + nrUmerase + "]";
    }

    
    

}
