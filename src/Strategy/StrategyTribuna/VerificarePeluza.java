package Strategy.StrategyTribuna;

public class VerificarePeluza implements IVerificare {

    @Override
    public void alegeVerificare(Spectator spectator) {
        System.out.println("Pentru spectatorul " + spectator.getSpectator() +
        spectator.getBagaje() + " si " + spectator.getHaine());
    }
    
}
