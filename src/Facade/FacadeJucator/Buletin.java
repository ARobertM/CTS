package Facade.FacadeJucator;

public class Buletin {

    public boolean verificaBuletin(Persoana p){
        if(p.getSerieBuletin().toString().length() == 6 ){
            System.out.println("S-a verificat buletinul!");
            return true;
        }
        else{
            return false;
        }
    }
}
