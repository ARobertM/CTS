package Template.TemplateSpital;

public class SpitalPrivat extends AProceduraPacient {

    @Override
    public void stabilizeazaPacientEchipaMedicala(Pacient pacient) {
        System.out.println("Echipa externa de medici stabilizeaza pacientul "+ pacient.getNumePacient());
    }

}
