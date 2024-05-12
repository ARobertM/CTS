package Proxy.ProxyVictor;

public class Client {
    private String nume;
    private boolean areReteta;

    public Client(String nume,boolean areReteta) {
        this.nume = nume;
        this.areReteta = areReteta;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }
    
}
