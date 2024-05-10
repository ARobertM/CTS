package Observer.ObserverSpital;

public class Spital extends Observabil{
    public void internarePacient(Pacient p){
        System.out.println("S-a internat "+p.getNume());
        this.addObservator(p);
    }

    public void identificareVirusNou(String virus){
        System.out.println("In spital s-a gasit un virus " + virus);
        this.notifyAll("VIRUS NOU BAAA -> " + virus);
    }
}
