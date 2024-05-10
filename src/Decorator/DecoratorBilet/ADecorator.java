package Decorator.DecoratorBilet;

public abstract class ADecorator implements IBilet {

    protected IBilet bilet;
    
    public ADecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public String getEchipaDeplasare() {
        return bilet.getEchipaDeplasare();
    }

    @Override
    public String getEchipaLocala() {
        return bilet.getEchipaLocala();
    }

    @Override
    public void print() {
        bilet.print();
    }

}
