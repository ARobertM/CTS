package Strategy.StrategyTribuna;

public class VerificareVip implements IVerificare {

    @Override
    public void alegeVerificare(Spectator spectator) {
        System.out.println("Spectatorul " + spectator.getSpectator() + " " +spectator.getBilet()); 
    }
    
}
