package Composite.CompositeRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements INod {
    private String denumire;
    private List<INod> listaMeniuNoduri;

    public Meniu(String denumire) {
        this.denumire = denumire;
        this.listaMeniuNoduri = new ArrayList<>();
    }

    @Override
    public void addNod(INod nod) {
        listaMeniuNoduri.add(nod);
    }

    @Override
    public INod getElement(int index) {
        return listaMeniuNoduri.get(index);
    }

    @Override
    public int getPret() {
        int total =0;
        for (INod iNod : listaMeniuNoduri) {
            total += iNod.getPret();
        }
        System.out.println("Pretul meniului este de : "+ total);
        return total;
    }

    @Override
    public void removeNod(INod nod) {
        this.listaMeniuNoduri.remove(nod);
    }
    
    
}
