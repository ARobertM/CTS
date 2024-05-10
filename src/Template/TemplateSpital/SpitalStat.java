package Template.TemplateSpital;

public class SpitalStat extends AProceduraPacient {

    @Override
    public void stabilizeazaPacientEchipaMedicala(Pacient pacient) {
        System.out.println("Echipa interna stabilizeaza pacientul " + pacient.getNumePacient());
    }

}
