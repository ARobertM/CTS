package Composite.CompositeMZ;

import java.util.ArrayList;
import java.util.List;

public class MeniulZilei implements INod {
    private String denumire;
    private List<INod> listaNoduri;

    public MeniulZilei(String denumire) {
        this.denumire = denumire;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void add(INod iNod) {
        listaNoduri.add(iNod);
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
        total = (int) (total*0.9);
        System.out.println("Pretul total a meniului este de : "+total);
        return total; 
        
    }

    @Override
    public void remove(INod iNod) {
        listaNoduri.remove(iNod);
    }
}
