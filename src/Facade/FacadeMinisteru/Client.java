package Facade.FacadeMinisteru;

import java.util.List;
import java.util.Map;

public class Client {
    private String cardSanatate;
    private String retata;
    private Map<String,Integer> listaMediacmente;

    public Client(String cardSanatate, String retata, Map<String, Integer> listaMediacmente) {
        this.cardSanatate = cardSanatate;
        this.retata = retata;
        this.listaMediacmente = listaMediacmente;
    }

    public String getCardSanatate() {
        return cardSanatate;
    }

    public String getRetata() {
        return retata;
    }

    public Map<String, Integer> getListaMediacmente() {
        return listaMediacmente;
    }

    

}
