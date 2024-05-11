package Proxy.Proxy14ani;

public class ProxyVanzareBilet implements IVanzareBilet {
    private final static int VARSTA_MINIMA = 14;
    private VanzareBilet vanzareBilet = new VanzareBilet();

    @Override
    public boolean permiteAccesul(Cumparator c) {
        if(verificaVarsta(c)){
            vanzareBilet.permiteAccesul(c);
            System.out.println("I s-a permis accesul lui : "+ c.getNume());
        }
        return false;
    }

    boolean verificaVarsta(Cumparator c){
        if(c.getVarsta() < VARSTA_MINIMA){
            System.out.println("Nu indepliniti varsta corespunzatoare!");
            return false;
        }else{
            System.out.println("Merge, da Messi gol?");
            return true;
        }
    }
    
}
