package Strategy.StrategyTribuna;

public class Main {
    public static void main(String[] args) {
        Spectator s1 = new Spectator(TipSpectator.TRIBUNA, "7263GD", "3 TROLEIBUZE", "ARMANI");
        Spectator s2 = new Spectator(TipSpectator.PELUZA, "35R26GD", "2 CAMIOANE", "BO$$");
        Spectator s3 = new Spectator(TipSpectator.VIP, "1263GD", "1 MASINA", "GEORGE");

        IntrareStadion intrareStadion = new IntrareStadion();
        intrareStadion.setIverificare(new VerificarePeluza());
        intrareStadion.alegereVerificare(s2);

        intrareStadion.setIverificare(new VerificareTribuna());
        intrareStadion.alegereVerificare(s2);

        intrareStadion.setIverificare(new VerificareVip());
        intrareStadion.alegereVerificare(s2);

        
    }
}
