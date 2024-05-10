package Observer.ObserverSpital;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Artiont");
        Pacient p2 = new Pacient("Sabinache");

        Spital spital = new Spital();

        spital.internarePacient(p1);
        spital.internarePacient(p2);

        spital.identificareVirusNou("GRIPA AVIARAAA");

        spital.removeObserver(p1);
        spital.identificareVirusNou("CIUMA");
    }
}
