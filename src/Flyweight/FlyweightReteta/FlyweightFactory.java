package Flyweight.FlyweightReteta;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<Integer,Recomandare> listaRecomandari;

    static {
        listaRecomandari = new HashMap<Integer,Recomandare>();
        listaRecomandari.put(1, new Recomandare(1, "consumati minim 2 litrii de lichide!"));
        listaRecomandari.put(2, new Recomandare(2, "sa aveti numarul de somn cum trebuie!"));
    }

    public static Recomandare getRecomandare(int cod){
        Recomandare r = listaRecomandari.get(cod);
        return r;
    }

}
