package Composite.CompositeMZ;

public interface INod {
    public int getPret();
    public void remove(INod iNod);
    public void add(INod iNod);
    public INod getElement(int index);
}
