package Decorator.DecoratorClient;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("12.03.2024");
        System.out.println(rezervare.detalii());

        ARezervare rezervareDecorata = new DecoratorExtra(rezervare,false,true,false,false,false);
        System.out.println(rezervareDecorata.detalii());
    }
}
