package Facade.FacadeMinisteru;

public class MinisterulSanatatii {
    public boolean verificareCardSanatate(String cardSanatate){
        if(cardSanatate.length()%2 == 0){
            return true;
        }
        return false;
    }
}
