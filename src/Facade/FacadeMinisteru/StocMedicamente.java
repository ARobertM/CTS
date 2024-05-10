package Facade.FacadeMinisteru;

public class StocMedicamente {
    public boolean verificaStocMedicament(String medicament,int cantitate){
        if(cantitate%2 == 0){
            return true;
        }
        return false;
    }
}
