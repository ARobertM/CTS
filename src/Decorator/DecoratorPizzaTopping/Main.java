package Decorator.DecoratorPizzaTopping;

public class Main {
    public static void main(String[] args) {
        IProdus p1 = new Produs("Savarina", 12, "Romaneasca", "buna raw");
        IProdus p2 = new Produs("Italian", 22, "Italiana", "este din italia boss");

        p1.afisareProdus();
        p2.afisareProdus();

        // IProdus produsDecorat1 = new DecoratorSpaniol(p2);
        // produsDecorat1.afisareProdus();
        
        IProdus produsDecorat1 = new DecoratorSpaniol(new DecoratorItalian(p1));
        produsDecorat1.afisareProdus();

        p2 = new DecoratorSpaniol(p2);
        p2.afisareProdus();

    }
}
