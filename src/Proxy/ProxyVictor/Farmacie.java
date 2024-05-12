package Proxy.ProxyVictor;

public class Farmacie implements IFarmacie {

    @Override
    public void cumparareMedicamente(Client c) {
       System.out.println("Clientul "+ c.getNume() + " cumpara medicamente !");
    }
    
}
