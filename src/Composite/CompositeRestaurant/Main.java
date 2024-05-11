package Composite.CompositeRestaurant;

import Composite.CompositeRestaurant.*;

public class Main {
    public static void main(String[] args) {
        INod meniu = new Meniu("Meniul Zilei");
        INod produs1 = new Produs("ceafa de porc", 35);
        INod bautura1 = new Bauturi("cocî-cola", 7);

        produs1.addNod(bautura1);
        meniu.addNod(produs1);

        System.out.println(produs1.getPret());
        System.out.println(meniu.getPret());
    }
}
