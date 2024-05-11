package Strategy.StrategyCarbohidrati;

import java.util.ArrayList;

public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMenius = new ArrayList<>();
    IProcesabil strategieAlegere;

    public void adaugareMeniu(OfertaMeniu m){
        this.listaMenius.add(m);
    }
    public void setStrategieAlegere(IProcesabil p){
        this.strategieAlegere = p;
    }

    public OfertaMeniu alegOfertaMeniu(){
        if(strategieAlegere != null){
            return strategieAlegere.alegereMeniu(listaMenius);
        }else{
            throw new UnsupportedOperationException();
        }
    }
}
