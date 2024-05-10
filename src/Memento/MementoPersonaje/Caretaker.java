package Memento.MementoPersonaje;

public class Caretaker {
    private Memento memento;

    public void salvareState(ICaracter caracter){
        this.memento = caracter.salvareCustomizare();
    }

    public void restoreState(ICaracter caracter){
        if(memento != null){
            caracter.restaureazaModificare(memento);
        }
    }
}
