package Strategy.StrategyDezvoltare;

import java.util.ArrayList;

public class Aplicatie {
    private ArrayList<Produs> listaProduse = new ArrayList<>();
    private IProdus strategieOrdine;
    
    public void addProdus(Produs produs){
        this.listaProduse.add(produs);
    }
    public void setStrategieOrdine(IProdus strategieAlegere){
        this.strategieOrdine = strategieAlegere;
    }

    public Produs alegereOrdine(){
        if(strategieOrdine != null){
            return strategieOrdine.alegereOrdine(listaProduse);
        }else{
            throw new UnsupportedOperationException();
        }
    }
}
