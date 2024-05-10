package Flyweight.FlyweightReteta;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<String> listaMedicamente = new ArrayList<>();
        listaMedicamente.add("nurofen");
        listaMedicamente.add("ceai de pl-n gura");
        Reteta r = new Reteta(listaMedicamente, "durere in pl", "12.03.2024");
        FlyweightFactory.getRecomandare(1).printeazaReteta(r);
    }
}
