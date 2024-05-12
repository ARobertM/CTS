package Observer.ObserverManager2Victor;

public class Client implements IObserver {
    private String numeClient;
    

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }
    public String getNumeClient() {
        return numeClient;
    }

    @Override
    public void notificare(TipMeci tipMeci) {
        System.out.println("Joc " + tipMeci);        
    }

}
