package Composite.CompositeRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Produs implements INod {
    private String denumire;
    private int pret;
    private List<INod> listaNoduri;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void addNod(INod nod) {
       listaNoduri.add(nod);
    }

    @Override
    public INod getElement(int index) {
        return listaNoduri.get(index);
    }

    @Override
    public int getPret() {
        int total = 0;
        for (INod iNod : listaNoduri) {
            total += iNod.getPret();
        }
        int total2 = total + this.pret;
        System.out.println("Pretul prod+bautura este de "+ total2);
        return total2;
    }

    @Override
    public void removeNod(INod nod) {
        listaNoduri.remove(nod);
    }
    

    
}
