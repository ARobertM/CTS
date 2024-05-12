package Observer.ObserverManager2Victor;

import java.util.ArrayList;
import java.util.List;

public class Observabil {
    private List<IObserver> listaObservatori = new ArrayList<>();

    public void abonareObservator(IObserver obs){
        this.listaObservatori.add(obs);
    }
    public void dezabonareObservator(IObserver obs){
        this.listaObservatori.remove(obs);
    }

    public void notificaObservatori(TipMeci tipMeci){
        for (IObserver iObserver : listaObservatori) {
            iObserver.notificare(tipMeci);
        }
    }
}
