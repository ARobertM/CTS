package Composite.CompositeMeniulZilei;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private String label;
    protected List<INod> listaNod;

    public NodStructura(String label) {
        super();
        this.label = label;
        this.listaNod = new ArrayList<INod>();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addElement(INod nod) {
        this.listaNod.add(nod);
    }

    @Override
    public INod getElement(int index) {
        return this.listaNod.get(index);
    }

}
