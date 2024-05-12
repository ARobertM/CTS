package Facade.FacadeJucator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> antecedente = new ArrayList<>();
        // antecedente.add("a aruncat un covrig!");

        Persoana p = new Persoana("Sabin", 458291, antecedente);
        Manager m = new Manager();
        m.preluarePersoana(p);
    }
}
