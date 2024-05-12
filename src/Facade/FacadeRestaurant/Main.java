package Facade.FacadeRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        Ospatar osp = new Ospatar();

        osp.preluareClient(r,2);
    }
}
