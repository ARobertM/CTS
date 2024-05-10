package Facade.FacadeMinisteru;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,Integer> listaMedicamente = new HashMap<>();
        listaMedicamente.put("Nurofen", 20);
        listaMedicamente.put("Parasinus", 16);
        listaMedicamente.put("Aulin", 6);

        Client c = new Client("1234", "123456", listaMedicamente);
        Farmacist farmacist = new Farmacist();
        farmacist.preluareClient(c);
    
    }
}
