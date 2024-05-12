
package Proxy.ProxyVictor;

public class FarmacieProxy implements IFarmacie {

    private Farmacie farmacie = new Farmacie();
    
    @Override
    public void cumparareMedicamente(Client c) {
        if(c.isAreReteta()){
            farmacie.cumparareMedicamente(c);
            System.out.println("Are reteta! sa cumpere Aulin!");
        }else{
            System.out.println("Clientul nu are reteta");
        }        
    }
    
}
