package Strategy.StrategyDezvoltare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StrategyOrdineCrescatoare implements IProdus {

    @Override
    public Produs alegereOrdine(ArrayList<Produs> listaProduse) {
        Collections.sort(listaProduse, (p1,p2) -> Double.compare(p1.getPret(), p2.getPret()));
        for (Produs p  : listaProduse) {
            System.out.println(p.toString());
        }
        return null;
    }

}
