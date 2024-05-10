package Memento.MementoPersonaje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caracter c1 = new Caracter(TipCaracter.RAZBOINIC);
        List<String> listaArme = new ArrayList<>();
        listaArme.add("pistol");
        listaArme.add("sabie");
        listaArme.add("bata");
        c1.customizareCaracter("brunet", listaArme, "alb");
        c1.display();

        
        // Salvare Memento
        Caretaker caretaker = new Caretaker();
        caretaker.salvareState(c1);

        listaArme.add("jpoc");
        c1.customizareCaracter("alb", listaArme, "alb-inchis");
        c1.display();

        caretaker.restoreState(c1);
        c1.display();
    }
}
