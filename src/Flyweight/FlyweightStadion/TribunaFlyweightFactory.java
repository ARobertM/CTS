package Flyweight.FlyweightStadion;

import java.util.HashMap;

public class TribunaFlyweightFactory {
    private static HashMap<Integer,PersonajPermanen> listaPersonajePermanente;

    static{
        listaPersonajePermanente = new HashMap<Integer,PersonajPermanen>();
        listaPersonajePermanente.put(1, new PersonajPermanen(2.4, 1.6));
        listaPersonajePermanente.put(1, new PersonajPermanen(1.3, 2.6));
        listaPersonajePermanente.put(1, new PersonajPermanen(12.4, 8.3));
    }

    public static PersonajPermanen getPersonajPermanen(int cod){
        return listaPersonajePermanente.get(cod);
    }
}
