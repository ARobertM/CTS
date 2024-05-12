package Adapter.AdapterBilete;

import Decorator.DecoratorBilet.IBilet;

public class Main {
    public static void main(String[] args) {
        VanzareBilete sistemOriginal = new VanzareBilete();
        EBilet biletPlatforma = new Adapter();

        biletPlatforma.cumparareBilet("Steaua-Dinamo", 200);
    }
}
