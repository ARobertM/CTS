package Template.TemplateSpital;

public  abstract class AProceduraPacient {
    // metoda finala se declara abstracta , aî sa nu poata fi suprascrisa
    public final boolean verificaSemneVitale(Pacient pacient){
        if(pacient.isAreSuspiciuniGrave()){
            return true;
        }
        return false;
    }

    public final void verificaCentralizatorulDeProgramari(Pacient pacient){
        System.out.println("Se verifica centralizatorul pentru pacientul :" + pacient.getNumePacient());
    }

    public abstract void stabilizeazaPacientEchipaMedicala(Pacient pacient);

    public final boolean getPatSpitalCurent(Pacient pacient){
        System.out.println("Se verifica disponibilitate...");
        if(pacient.getNumePacient().length()%2 == 0){
            System.out.println("Pacientul o sa fie instalat in spitalul curent!");
            return true;
        }
        return false;
    }

    public final boolean getPatSpitalExterior(Pacient pacient){
        System.out.println("Se verifica disponibilitate externa...");
        if(pacient.getNumePacient().length()%2 == 0){
            return false;
        }
        return true;
    }

    public final void preluarePacient(Pacient pacient){
        if(verificaSemneVitale(pacient)){
            stabilizeazaPacientEchipaMedicala(pacient);
            if(!getPatSpitalCurent(pacient)){
                getPatSpitalExterior(pacient);
            }
        }
        else{
            verificaCentralizatorulDeProgramari(pacient);
        }
    }
}
