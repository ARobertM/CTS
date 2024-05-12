package Flyweight.FlyweightClient;

public class Main {
    public static void main(String[] args) {
        Masa m = new Masa(1, 3, "19:20");
        FlyweightFactory.getClient(2).rezervaMasa(m);
    }
}
