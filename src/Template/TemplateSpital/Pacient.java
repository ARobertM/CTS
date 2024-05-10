package Template.TemplateSpital;

public class Pacient {
    private String numePacient;
    private boolean areSuspiciuniGrave;

    public Pacient(String numePacient, boolean areSuspiciuniGrave) {
        this.numePacient = numePacient;
        this.areSuspiciuniGrave = areSuspiciuniGrave;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean isAreSuspiciuniGrave() {
        return areSuspiciuniGrave;
    }

    
    public void setAreSuspiciuniGrave(boolean areSuspiciuniGrave) {
        this.areSuspiciuniGrave = areSuspiciuniGrave;
    }

    @Override
    public String toString() {
        return "Pacient [numePacient=" + numePacient + ", areSuspiciuniGrave=" + areSuspiciuniGrave + "]";
    }

}
