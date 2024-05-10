package Memento.MementoPersonaje;

import java.util.List;

public class Memento {
    private final String culoarePar;
    private final List<String> listaArme;
    private final String culoarePiele;

    public Memento(String culoarePar, List<String> listaArme, String culoarePiele) {
        this.culoarePar = culoarePar;
        this.listaArme = listaArme;
        this.culoarePiele = culoarePiele;
    }

    public String getCuloarePar() {
        return culoarePar;
    }

    public List<String> getListaArme() {
        return listaArme;
    }

    public String getCuloarePiele() {
        return culoarePiele;
    }
}
