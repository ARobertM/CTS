package Strategy.StrategyCarbohidrati;

public class Main {
    public static void main(String[] args) {
        OfertaMeniu ofertaMeniu1 = new OfertaMeniu("Meniu1", 900, 20);
        OfertaMeniu ofertaMeniu2 = new OfertaMeniu("Meniu2", 9400, 320);
        OfertaMeniu ofertaMeniu3 = new OfertaMeniu("Meniu3", 9020, 520);
    
        MeniuRestaurant m = new MeniuRestaurant();
        m.adaugareMeniu(ofertaMeniu1);
        m.adaugareMeniu(ofertaMeniu2);
        m.adaugareMeniu(ofertaMeniu3);

        m.setStrategieAlegere(new StrategieCalorii());
        System.out.println("Strategie Calorii");
        m.alegOfertaMeniu();

        m.setStrategieAlegere(new StrategieCalorii());
        m.alegOfertaMeniu();
    }
}
