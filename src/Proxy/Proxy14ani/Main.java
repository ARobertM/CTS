package Proxy.Proxy14ani;

public class Main {
    public static void main(String[] args) {
        Cumparator c1 = new Cumparator(12, "Mihai");    
        Cumparator c2 = new Cumparator(16, "Sabin");    
        Cumparator c3 = new Cumparator(19, "Zuzi");
        IVanzareBilet vanzare = new VanzareBilet();

        // vanzare.permiteAccesul(c1);
        // vanzare.permiteAccesul(c2);
        // vanzare.permiteAccesul(c3);
        IVanzareBilet vanzareProxy = new ProxyVanzareBilet();
        vanzareProxy.permiteAccesul(c1);
        vanzareProxy.permiteAccesul(c2);
        vanzareProxy.permiteAccesul(c3);
    }
}
