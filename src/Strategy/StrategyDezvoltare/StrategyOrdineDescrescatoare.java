package Strategy.StrategyDezvoltare;

import java.util.ArrayList;
import java.util.Collections;

public class StrategyOrdineDescrescatoare implements IProdus {

    @Override
    public Produs alegereOrdine(ArrayList<Produs> listaProduse) {
        Collections.sort(listaProduse, (p1,p2) -> Double.compare(p2.getPret(), p1.getPret()));
        for (Produs p  : listaProduse) {
            System.out.println(p.toString());
        }
        return null;
    }
    
}
