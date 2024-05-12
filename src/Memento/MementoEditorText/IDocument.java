package Memento.MementoEditorText;

import java.util.List;

public interface IDocument {
    Memento salvareDocument();
    void restaureazaModificare(Memento m);
    void customizareDocument(String continut, List<String> listaFont);
}
