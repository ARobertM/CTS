package Facade.FacadeRestaurant;

public class Facade {
    private static MasaLibera masaLibera = new MasaLibera();
    private static VerificaServeteler verificaServetele = new VerificaServeteler();

    public static void verificaMasa(Restaurant r, int nrMasa) {
        if (masaLibera.verificaMasa(r)) {
            if (verificaServetele.verificaServetele(r, nrMasa)) {
                System.out.println("Poftiti va rog!");
            } else {
                System.out.println("Servetele nu sunt verificate!");
            }
        } else {
            System.out.println("Nu am masa libera FACADE!");
        }
    }
}
