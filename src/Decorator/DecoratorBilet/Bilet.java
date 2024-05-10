package Decorator.DecoratorBilet;

public class Bilet implements IBilet {
    private String echipaLocala;
    private String echipaDeplasare;
    private int nrLoc;
    private int pret;

    public Bilet(String echipaLocala, String echipaDeplasare, int nrLoc, int pret) {
        this.echipaLocala = echipaLocala;
        this.echipaDeplasare = echipaDeplasare;
        this.nrLoc = nrLoc;
        this.pret = pret;
    }

    @Override
    public void print() {
        System.out.println("Biletul pentru meciul "+ this.echipaDeplasare + " - " + this.echipaLocala + " si locul " + this.nrLoc);
    }

    @Override
    public String getEchipaLocala() {
        return this.getEchipaLocala();
    }

    @Override
    public String getEchipaDeplasare() {
        return this.getEchipaDeplasare();
    }


    
}
