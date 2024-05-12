package Flyweight.FlyweightStadion;

public class Main {
    public static void main(String[] args) {
        PersonajTemporar p1 = new PersonajTemporar("rosu", "dreapta");

        TribunaFlyweightFactory.getPersonajPermanen(1).desenare(p1);
    }
}
