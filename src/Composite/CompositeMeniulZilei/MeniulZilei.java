package Composite.CompositeMeniulZilei;

public class MeniulZilei extends NodStructura {

    public MeniulZilei(String label) {
        super(label);
    }

    @Override
    public int getPret() {
        int total = 0;
        for(INod nod : this.listaNod){
            total += nod.getPret();
        }
        return (int)(total * 0.9);
    }
    
}
