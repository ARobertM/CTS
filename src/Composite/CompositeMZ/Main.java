package Composite.CompositeMZ;

public class Main {
    public static void main(String[] args) {
        INod meniu = new MeniulZilei("Meniul Zilei");
        INod produs1 = new Produs("Ceafa", 490);
        INod produs2 = new Produs("Ciorizo", 5000);

        meniu.add(produs1);
        meniu.add(produs2);

        System.out.println(meniu.getPret());
    }
}
