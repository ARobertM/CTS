package Flyweight.FlyweightStadion;

public class PersonajPermanen implements IDesenare {
    private double inaltime;
    private double latime;
    @Override
    public void desenare(PersonajTemporar p) {
        System.out.println(this.toString() + p.getCuloare() + " " + p.getPozitie());
        
    }
    public PersonajPermanen(double inaltime, double latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }
    @Override
    public String toString() {
        return "PersonajPermanen [inaltime=" + inaltime + ", latime=" + latime + "]";
    }
    
}
