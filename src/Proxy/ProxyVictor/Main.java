package Proxy.ProxyVictor;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Victor", false);
        Client c2 = new Client("Robetr", true);

        IFarmacie farmacie = new Farmacie();
        farmacie.cumparareMedicamente(c1);

        IFarmacie farmacieProxy = new FarmacieProxy();
        farmacieProxy.cumparareMedicamente(c2);
    }
}
