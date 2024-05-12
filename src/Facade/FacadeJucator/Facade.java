package Facade.FacadeJucator;

public class Facade {
    private static Buletin buletin = new Buletin();
    private static CautatPolitie cautatPolitie = new CautatPolitie();

    public static void verificarePersoana(Persoana p){
        if(cautatPolitie.verificaCautarePolitie(p)){
            if(buletin.verificaBuletin(p)){
                System.out.println("Are permis accesul!");
                System.out.println("Da Messi GOL? =)");
            }else{
                System.out.println("Nu are seria buna! Nu i permitem accesul!");
            }
        }else{
            System.out.println("Avem antecedente! Nu i permitem intarrea!");
        }
    }
}
