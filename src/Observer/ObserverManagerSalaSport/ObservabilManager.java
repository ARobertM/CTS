package Observer.ObserverManagerSalaSport;

import java.util.ArrayList;
import java.util.List;

public class ObservabilManager {
    
    private List<IObservabil> listaObservatoi = new ArrayList<>();

    public void addObservator(IObservabil obs){
        listaObservatoi.add(obs);
    }
    public void removeObservator(IObservabil obs){
        listaObservatoi.remove(obs);
    }
    public void notifyAll(String mesaj){
        for (IObservabil iObservabil : listaObservatoi) {
            iObservabil.notificare(mesaj);
        }
    }
}
