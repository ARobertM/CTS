package Decorator.DecoratorPizzaTopping;

public class Produs implements IProdus {
    private String denumireProdus;
    private int pret;
    private String specialitate;
    private String descriere;

    public Produs(String denumireProdus, int pret, String specialitate, String descriere) {
        this.denumireProdus = denumireProdus;
        this.pret = pret;
        this.specialitate = specialitate;
        this.descriere = descriere;
    }

    @Override
    public void afisareProdus() {
        System.out.println("Produsul "+ this.denumireProdus + " are specialiatatea "+ this.specialitate + " la un pret de doar "+ this.pret);
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public String getDenumire() {
        return this.denumireProdus;
    }

    @Override
    public String getSpecialitate() {
        return this.specialitate;
    }
    


    
}
