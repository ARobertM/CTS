package Observer.ObserverManagerSalaSport;

public class Abonat implements IObservabil {
    private String nume;
    
    public Abonat(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Abonatul "+ this.nume +
            "a fost notificat cu : " + mesaj);
    }

}
