package Composite.CompositeRestaurant;

public interface INod {
    void addNod(INod nod);
    INod getElement(int index);
    void removeNod(INod nod);

    int getPret();

}
