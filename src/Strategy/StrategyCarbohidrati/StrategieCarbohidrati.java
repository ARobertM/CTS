package Strategy.StrategyCarbohidrati;

import java.util.ArrayList;

public class StrategieCarbohidrati implements IProcesabil {

    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniu = listaMeniuri.get(0);
        for (OfertaMeniu of : listaMeniuri) {
            if(ofertaMeniu.getNrCarbohidrati() < of.getNrCarbohidrati()){
                ofertaMeniu = of;
            }
        }
        return ofertaMeniu;
    }
    
}
