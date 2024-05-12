package Facade.FacadeRestaurant;

public class MasaLibera {
    public boolean verificaMasa(Restaurant r){
        if(r.getListaMese().containsKey(2)){
            System.out.println("Masa este libera! Puteti intra!");
            return true;
        }
        return false;
    }
}
