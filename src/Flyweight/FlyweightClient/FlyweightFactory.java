package Flyweight.FlyweightClient;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Integer,Client> listaRezervari = new HashMap<Integer,Client>();

    static{
        listaRezervari.put(1, new Client("Andrei", "0752325059", "armihai1664@gmail.com"));
        listaRezervari.put(2, new Client("Robert", "0752325359", "armihai1663@gmail.com"));
        listaRezervari.put(3, new Client("Andrei", "0782325059", "armihai1662@gmail.com"));
    }

    public static Client getClient(int cod){
        return listaRezervari.get(cod);
    }
}
