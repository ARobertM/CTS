package Memento.MementoPersonaje;

import java.util.List;

public interface ICaracter {
    void customizareCaracter(String culoarePar, List<String> listaArme, String culoarePiele);
    Memento salvareCustomizare();
    void restaureazaModificare(Memento m);
    void display();
}
