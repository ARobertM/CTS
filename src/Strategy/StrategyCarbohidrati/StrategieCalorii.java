package Strategy.StrategyCarbohidrati;

import java.util.ArrayList;

public class StrategieCalorii implements IProcesabil{

    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniu = listaMeniuri.get(0);
        for (OfertaMeniu of : listaMeniuri) {
            if(ofertaMeniu.getNrCalorii() < of.getNrCalorii()){
                ofertaMeniu = of;
            }
        }
        return ofertaMeniu;
    }
    
}
