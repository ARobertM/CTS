package Flyweight.FlyweightClient;

public class Client implements IRezervare {
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }
    


    @Override
    public void rezervaMasa(Masa m) {
        System.out.println(this.toString());
        System.out.println("Are masa : " + m.toString());        
    }

    public String getNume() {
        return nume;
    }



    public String getNrTelefon() {
        return nrTelefon;
    }



    public String getAdresaMail() {
        return adresaMail;
    }



    @Override
    public String toString() {
        return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresaMail=" + adresaMail + "]";
    }
    
    
}
