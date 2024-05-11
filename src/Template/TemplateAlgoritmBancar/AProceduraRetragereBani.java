package Template.TemplateAlgoritmBancar;

public abstract class AProceduraRetragereBani {

    // public final void introducereCard(Utilizator u){
    //     System.out.println("Cardul " + u.getNumarCard() + " a fost introdus cu succes!");
    // }
    protected abstract void introducereCard(Utilizator u);
    
    public final boolean areIntrodusPinul(Utilizator u){
        System.out.println("-> Se citeste pinul...");
        int pin = 2002;
        if(u.getPin() == pin){
            System.out.println("PIN Corect");
            return true;
        }else{
            System.out.println("PIN INCORECT");
            return false;
        }
    }
    public final void specificaSuma(Utilizator u){
        System.out.println("Utilizatorul a specificat suma de : " + u.getSuma());
    }

    public final void retrageSuma(){
        System.out.println("Banii au fost retrasi!");
    }

    public final void retrageCard(){
        System.out.println("Cardul a fost scos din bancomat!");
    } 


    public final void proceduraRetragere(Utilizator u){
        introducereCard(u);
        if(areIntrodusPinul(u)){
            specificaSuma(u);
            retrageSuma();
        }
        retrageCard();
    }
}
