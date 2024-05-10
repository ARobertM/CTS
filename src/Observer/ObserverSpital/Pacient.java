package Observer.ObserverSpital;

public class Pacient implements IObserver {
    private String nume;
    

    public Pacient(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Info :" + mesaj);
    }





   

}
