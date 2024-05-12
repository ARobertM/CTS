package Memento.MementoEditorText;

import java.util.ArrayList;
import java.util.List;

import Memento.MementoPersonaje.ICaracter;

public class Caretaker {
    private List<Memento> listaMemento = new ArrayList<>();
    private Memento m;

    public void salvareState(IDocument document){
            this.m = document.salvareDocument();
    }
    public void restoreState(IDocument document){
        if(m != null){
            document.restaureazaModificare(m);
        }
    }
    public void adaugareStareLista(Memento m){
        listaMemento.add(m);
    }
    public Memento getMementoLista(int index){
        return listaMemento.get(index);
    }

}
