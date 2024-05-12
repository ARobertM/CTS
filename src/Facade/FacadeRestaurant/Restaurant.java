package Facade.FacadeRestaurant;

import java.util.HashMap;

public class Restaurant {
    private static HashMap<Integer,Masa> listaMese;

    static{
        listaMese = new HashMap<Integer,Masa>();
        listaMese.put(2,new Masa(1,true));
        listaMese.put(3,new Masa(2,false));
        listaMese.put(1,new Masa(3,false));
        listaMese.put(4,new Masa(4,true));
    }

    public static HashMap<Integer, Masa> getListaMese() {
        return listaMese;
    }
}
