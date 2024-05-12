package Observer.ObserverManager2Victor;

public class Manager extends Observabil {
    private String nume;

    public Manager(String nume) {
        this.nume = nume;
    }

    public void abonareClient(Client c){
        System.out.println("Clientul :" + c.getNumeClient() + " s-a abonat!");
        this.abonareObservator(c);
    }

    public void notificareMeci(TipMeci tipMeci){
        switch (tipMeci) {
            case FOTBAL:
                this.notificaObservatori(tipMeci);
                break;
            case HANDBALL:
                this.notificaObservatori(tipMeci);
                break;
            case VOLEY:
                this.notificaObservatori(tipMeci);
                break;
            default:
                break;
        }
    }

    
}
