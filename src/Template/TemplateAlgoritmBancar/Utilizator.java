package Template.TemplateAlgoritmBancar;

public class Utilizator {
    private String numarCard;
    private int suma;
    private int pin;

    public Utilizator(String numarCard, int suma, int pin) {
        this.numarCard = numarCard;
        this.suma = suma;
        this.pin = pin;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public int getSuma() {
        return suma;
    }
    
    public int getPin() {
        return pin;
    }
    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Utilizator [numarCard=" + numarCard + ", suma=" + suma + ", pin=" + pin + "]";
    }

   
    
}
