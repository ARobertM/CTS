package Observer.ObserverSpital;

import java.util.ArrayList;
import java.util.List;

public class Observabil {
    private List<IObserver> listaObservatori = new ArrayList<>();

    public void addObservator(IObserver obs){
        listaObservatori.add(obs);
    }

    public void removeObserver(IObserver obs){
        listaObservatori.remove(obs);
    }

    public void notifyAll(String mesaj){
        for (IObserver iObserver : listaObservatori) {
            iObserver.notificare(mesaj);
        }
    }
}
