package Memento.MementoPersonaje;

import java.util.List;

public class Caracter implements ICaracter {

    private final TipCaracter tipCaracter;
    private String culoarePar;
    private List<String> listaArme;
    private String culoarePiele;

    public Caracter(TipCaracter tipCaracter) {
        this.tipCaracter = tipCaracter;
    }

    @Override
    public void customizareCaracter(String culoarePar, List<String> listaArme, String culoarePiele) {
        this.culoarePar = culoarePar;
        this.listaArme = listaArme;
        this.culoarePiele = culoarePiele;
    }

    @Override
    public void display() {
        System.out.println("Caracter [tipCaracter=" + tipCaracter + ", culoarePar=" + culoarePar + ", listaArme=" + listaArme
        + ", culoarePiele=" + culoarePiele + "]");
    }

    @Override
    public void restaureazaModificare(Memento m) {
       this.culoarePar = m.getCuloarePar();
       this.listaArme = m.getListaArme();
       this.culoarePiele = m.getCuloarePiele();
    }

    @Override
    public Memento salvareCustomizare() {
        return new Memento(culoarePar, listaArme, culoarePiele);
    }

}
