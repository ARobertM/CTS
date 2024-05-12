package Facade.FacadeJucator;

public class CautatPolitie {
    public boolean verificaCautarePolitie(Persoana p){
        if(p.getAntecedenteAlteStadioane().isEmpty()){
            System.out.println("Nu are antecedente! : "+ p.getNume());
            return true;
        }
        else{
            return false;
        }
    }
}
