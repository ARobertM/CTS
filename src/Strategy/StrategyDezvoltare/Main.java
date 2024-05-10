package Strategy.StrategyDezvoltare;


public class Main {
    public static void main(String[] args) {
        Aplicatie aplicatie = new Aplicatie();

        Produs p1 = new Produs("pÎine", 2, 5000);
        Produs p2 = new Produs("lapte", 5, 10000);
        Produs p3 = new Produs("uouî", 30, 100);

        aplicatie.addProdus(p1);
        aplicatie.addProdus(p2);
        aplicatie.addProdus(p3);

        aplicatie.setStrategieOrdine(new StrategyOrdineCrescatoare());
        System.out.println("Listare in ordine crescatoare: ");
        aplicatie.alegereOrdine();

        aplicatie.setStrategieOrdine(new StrategyOrdineDescrescatoare());
        System.out.println("Listare in ordine descrescatoare: ");
        aplicatie.alegereOrdine();
    }
}
