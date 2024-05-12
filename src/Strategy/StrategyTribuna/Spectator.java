package Strategy.StrategyTribuna;

public class Spectator {
    private TipSpectator spectator;
    private String bilet;
    private String bagaje;
    private String haine;

    public Spectator(TipSpectator spectator, String bilet, String bagaje, String haine) {
        this.spectator = spectator;
        this.bilet = bilet;
        this.bagaje = bagaje;
        this.haine = haine;
    }

    public TipSpectator getSpectator() {
        return spectator;
    }

    public String getBilet() {
        return bilet;
    }

    public String getBagaje() {
        return bagaje;
    }

    public String getHaine() {
        return haine;
    }

    @Override
    public String toString() {
        return "Spectator [spectator=" + spectator + ", bilet=" + bilet + ", bagaje=" + bagaje + ", haine=" + haine
                + "]";
    }
}
