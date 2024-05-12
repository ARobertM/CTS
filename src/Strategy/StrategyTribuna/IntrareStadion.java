package Strategy.StrategyTribuna;

public class IntrareStadion {
    private IVerificare Iverificare;

    public void setIverificare(IVerificare iverificare) {
        Iverificare = iverificare;
    }

    public void alegereVerificare(Spectator spectator){
        if(Iverificare != null){
            Iverificare.alegeVerificare(spectator);
        }
    }
}
