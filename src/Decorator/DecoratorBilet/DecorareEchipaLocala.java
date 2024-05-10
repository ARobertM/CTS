package Decorator.DecoratorBilet;

public class DecorareEchipaLocala extends ADecorator{

    private String echipaLocala;

    public DecorareEchipaLocala(IBilet bilet, String echipaLocala) {
        super(bilet);
        this.echipaLocala = echipaLocala;
    }

    @Override
    public void print() {
        if(this.echipaLocala.compareTo(bilet.getEchipaLocala()) == 0){
            System.out.println("Se printeaza echipa locala :D");
        }
        super.print();
    }


}
