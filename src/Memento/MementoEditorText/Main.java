package Memento.MementoEditorText;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Document doc1 = new Document("Hamcearca");

        List<String> listaFonturi = new ArrayList<>();
        listaFonturi.add("Boldat");
        listaFonturi.add("Italic");
        
        doc1.customizareDocument("are 4 paragrafe", listaFonturi);
        System.out.println(doc1.toString());

        Caretaker caretaker = new Caretaker();
        caretaker.salvareState(doc1);
        
        listaFonturi.add("Fortat");
        doc1.customizareDocument("documentul are 3 paragrafe", listaFonturi);
        System.out.println(doc1.toString());

        caretaker.restoreState(doc1);
        System.out.println(doc1.toString());
    }
}
