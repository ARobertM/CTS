package Flyweight.FlywightCamera;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Integer,Inventar> listaInventar;

    static{
        listaInventar = new HashMap<Integer,Inventar>();
        listaInventar.put(1, new Inventar(23,23,1,43));
        listaInventar.put(2, new Inventar(2, 3, 56, 89));
    }

    public static Inventar getInventar(int cod){
        Inventar v = listaInventar.get(cod);
        return v;
    }
}
