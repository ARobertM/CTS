package Proxy.ProxySpital;

import java.util.ArrayList;
import java.util.List;

public class SiptalProxy implements ISpital {
    private ISpital spital; //face referinta la Spital
    private List<Vizitator> vizitatorList;
    static final int nrMinim = 2;
    
    public SiptalProxy(ISpital spital) {
        this.spital = spital;
        this.vizitatorList = new ArrayList<Vizitator>();
    }

    @Override
    public boolean permiteAcces(Vizitator v) {
        if(verificaExistentaScrisoare(v)){
            vizitatorList.add(v);
            if(vizitatorList.size() == SiptalProxy.nrMinim){
                echipeazaVizitatori();
                for (Vizitator vizitator : vizitatorList) {
                    spital.permiteAcces(vizitator);
                }
                vizitatorList.clear();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verificaExistentaScrisoare(Vizitator v) {
        return spital.verificaExistentaScrisoare(v);
    }

    private void echipeazaVizitatori(){
        System.out.println(" -> Incepe Echiparea");
        for (Vizitator vizitator : vizitatorList) {
            System.out.println("A fost echipat "+ vizitator.getNumeViz());
        }
        System.out.println(" -> Final Echipare");
    }



    

    
}
