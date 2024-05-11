package Proxy.Proxy14ani;

public class VanzareBilet implements IVanzareBilet {

    @Override
    public boolean permiteAccesul(Cumparator c) {
        System.out.println("I-a fost permis accesul!" + c.getNume());
        return true;
    }

    
}
