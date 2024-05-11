package Flyweight.FlywightCamera;

public class Main {
    public static void main(String[] args) {
        
        Camera c = new Camera(1, "Sabin");
        FlyweightFactory.getInventar(1).tiparesteDetaliiCamera(c);
    
    }
}
