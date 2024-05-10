package Template.TemplateSpital;


public class ProgMain {
    public static void main(String[] args){
        AProceduraPacient proceduraPacient = new SpitalStat();
        Pacient pacient1 = new Pacient("Sabin", false);
        Pacient pacient2 = new Pacient("Robert", true);

        proceduraPacient.preluarePacient(pacient1);
        proceduraPacient.preluarePacient(pacient2);

        AProceduraPacient proceduraPacient2 = new SpitalPrivat();
        proceduraPacient2.preluarePacient(pacient1);
        proceduraPacient2.preluarePacient(pacient2);
    }
}
