package Template.TemplateAlgoritmBancar;

public class Bancomat extends AProceduraRetragereBani {

    @Override
    protected void introducereCard(Utilizator u) {
        // TODO Auto-generated method stub
        System.out.println("Cardul " + u.getNumarCard() + " a fost introdus cu succes!");
    }
    
    //Daca aveam ceva valente precum BancomatApropiat / BancomatAltaBanca
    // + chestii legate de bani sa zicem

}
