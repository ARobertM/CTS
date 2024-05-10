package Flyweight.FlyweightReteta;

public class Recomandare implements IPrintare {
    private int cod;
    private String continut;

    public Recomandare(int cod, String continut) {
        this.cod = cod;
        this.continut = continut;
    }

    @Override
    public void printeazaReteta(Reteta r) {
        System.out.println(r + " se printeaza cu recomandarea: "+ this.continut);
        
    }

    
}
