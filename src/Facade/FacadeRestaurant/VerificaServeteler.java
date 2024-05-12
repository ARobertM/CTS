package Facade.FacadeRestaurant;

public class VerificaServeteler {
    public boolean verificaServetele(Restaurant r, int numarMasa) {
        Masa m = r.getListaMese().get(numarMasa);
        if (m != null) {
            if (m.isSuntServetele()) {
                System.out.println("Sunt servetele pe masa " + numarMasa + "!");
                return true;
            } else {
                System.out.println("Nu sunt servetele pe masa " + numarMasa + "!");
                return false;
            }
        } else {
            System.out.println("Masa cu numarul " + numarMasa + " nu exista!");
            return false;
        }
    }
}
