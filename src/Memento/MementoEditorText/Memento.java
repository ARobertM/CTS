package Memento.MementoEditorText;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private String continut;
    private List<String> listaFont;

    public Memento(String continut, List<String> listaFont) {
        this.continut = continut;
        this.listaFont = new ArrayList<>(listaFont);
    }

    public String getContinut() {
        return this.continut;
    }

    public List<String> getListaFont() {
        return new ArrayList<>(listaFont);
    }
}
