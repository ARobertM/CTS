package Memento.MementoContBancar;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private String numeComanda;
    private static List<String> listaContinut = new ArrayList<>();
    static{
        listaContinut.add("constituire");
        listaContinut.add("retragere");
        listaContinut.add("depunere");
    }

    public Memento(String numeComanda) {
        this.numeComanda = numeComanda;
        this.listaContinut = listaContinut;
    }

    @Override
    public String toString() {
        return "Memento [numeComanda=" + numeComanda + ", continutAdaugat= ";
    }

    public String getNumeComanda() {
        return numeComanda;
    }

    
}
