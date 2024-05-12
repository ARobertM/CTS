package Facade.FacadeJucator;

import java.util.List;

public class Persoana {
    private String nume;
    private Integer serieBuletin;
    private List<String> antecedenteAlteStadioane;

    public Persoana(String nume, Integer serieBuletin, List<String> antecedenteAlteStadioane) {
        this.nume = nume;
        this.serieBuletin = serieBuletin;
        this.antecedenteAlteStadioane = antecedenteAlteStadioane;
    }

    public String getNume() {
        return nume;
    }

    public Integer getSerieBuletin() {
        return serieBuletin;
    }

    public List<String> getAntecedenteAlteStadioane() {
        return antecedenteAlteStadioane;
    }

}
