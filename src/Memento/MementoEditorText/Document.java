package Memento.MementoEditorText;

import java.util.List;

public class Document implements IDocument {
    private final String titlu;
    private String continut;
    private List<String> listaFont;

    public Document(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void customizareDocument(String continut, List<String> listaFont) {
        this.continut = continut;
        this.listaFont = listaFont;
    }

    @Override
    public void restaureazaModificare(Memento m) {
        this.continut = m.getContinut();
        this.listaFont = m.getListaFont();
    }

    @Override
    public Memento salvareDocument() {
        return new Memento(continut, listaFont);
    }

    @Override
    public String toString() {
        return "Document [titlu=" + this.titlu + ", continut=" + 
        this.continut + ", listaFont=" + this.listaFont + "]";
    }
    

    
}
