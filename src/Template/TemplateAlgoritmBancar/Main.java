package Template.TemplateAlgoritmBancar;

public class Main {
    public static void main(String[] args) {
        Utilizator u1 = new Utilizator("1234-3453", 200, 2002);
        AProceduraRetragereBani procedura = new Bancomat();
        procedura.proceduraRetragere(u1);
    };
    
}   
