package Observer.ObserverManagerSalaSport;

public class SalaSport extends ObservabilManager {
    public void adaugareObservatori(Abonat a){
        System.out.println("S-a abonat "+ a.getNume());
        this.addObservator(a);
    }

    public void avertizareMeci(String mesaj,TipJoc tipJoc){
        switch (tipJoc) {
            case FOLBAL:
                System.out.println("Pe data de 10.05 se joaca "+ tipJoc.FOLBAL);
                this.notifyAll(mesaj);
                break;
            case VOLEY:
                System.out.println("Pe data de 10.05 se joaca "+ tipJoc.VOLEY);
                this.notifyAll(mesaj);
                break;
                // HANDBAL
            case HANDBAL:
                System.out.println("Pe data de 10.05 se joaca "+ tipJoc.HANDBAL);
                this.notifyAll(mesaj);
                break;
            default:
                break;
        }
    }   
}
