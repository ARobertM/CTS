package Proxy.ProxySpital;

public class Main {
    public static void main(String[] args) {
        ISpital spital = new Spital();
        Vizitator viz1 = new Vizitator("Gigel", true);
        Vizitator viz2 = new Vizitator("Dorel", false);
        Vizitator viz3 = new Vizitator("Nicu", true);

        spital.permiteAcces(viz1);
        spital.permiteAcces(viz2);
        spital.permiteAcces(viz3);
        System.out.println(" === Proxy === ");

        ISpital spitalProxy = new SiptalProxy(spital);
        spitalProxy.permiteAcces(viz1);
        spitalProxy.permiteAcces(viz2);
        spitalProxy.permiteAcces(viz3);
    }
}
