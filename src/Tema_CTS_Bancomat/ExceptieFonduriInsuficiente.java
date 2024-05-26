package Tema_CTS_Bancomat;

public class ExceptieFonduriInsuficiente extends RuntimeException {
    public ExceptieFonduriInsuficiente(String mesaj){
        super(mesaj);
    }
}
