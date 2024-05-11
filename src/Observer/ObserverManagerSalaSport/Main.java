package Observer.ObserverManagerSalaSport;

public class Main {
    public static void main(String[] args) {
        Abonat a1 = new Abonat("Azorel");
        Abonat a2 = new Abonat("Stromeleag");

        SalaSport salaSport = new SalaSport();
        salaSport.adaugareObservatori(a1);
        salaSport.adaugareObservatori(a2);

        salaSport.avertizareMeci("Dinamo-Ciulnita", TipJoc.FOLBAL);

        salaSport.removeObservator(a2);
        salaSport.avertizareMeci("Steaua-Calarasi", TipJoc.VOLEY);
    }
}
