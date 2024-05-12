package Strategy.StrategyTribuna;

public class VerificareTribuna implements IVerificare {

    @Override
    public void alegeVerificare(Spectator spectator) {
        System.out.println("Spectatorul " + spectator.getSpectator() + " are "+ spectator.getBagaje() + " bagaje");            
    }
    
}
