package Observer.ObserverManager2Victor;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Mirel");
        Client c2 = new Client("Stromeleag");
        Client c3 = new Client("Invartosat");

        Manager m1 = new Manager("ManagerPrincipal");
        m1.abonareClient(c1);
        m1.abonareClient(c2);
        m1.abonareClient(c3);

        m1.notificaObservatori(TipMeci.FOTBAL);
        m1.dezabonareObservator(c3);
        m1.notificaObservatori(TipMeci.VOLEY);
    }
}
