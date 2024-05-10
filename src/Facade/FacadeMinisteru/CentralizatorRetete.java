package Facade.FacadeMinisteru;

public class CentralizatorRetete {

    public boolean verificaReteta(String reteta){
        if(reteta.length()%2 == 0){
            return true;
        }
        return false;
    }
}
