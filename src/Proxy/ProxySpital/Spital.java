package Proxy.ProxySpital;

public class Spital implements ISpital {

    @Override
    public boolean permiteAcces(Vizitator v) {
        if(verificaExistentaScrisoare(v)){
            System.out.println("Vizitatorul are scrisoarea verificata : "+ v.getNumeViz());
            return true;
        }
        return false;
    }

    @Override
    public boolean verificaExistentaScrisoare(Vizitator v) {
        if(v.isScrisoareVerificata()){
            return true;
        }else{
            if(v.isAreScrisoare()){
                v.setScrisoareVerificata(true);
                return true;
            }else{
                v.setAreScrisoare(false);
                return false;
            }
        }
    }
    
}
