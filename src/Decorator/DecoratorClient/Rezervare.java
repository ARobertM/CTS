package Decorator.DecoratorClient;

public class Rezervare extends ARezervare{

    private String data;
    
    public Rezervare(String data) {
        this.data = data;
    }

    @Override
    public String detalii() {
        return data;
    }
    
}
