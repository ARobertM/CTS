package Adapter.AdapterBilete;

public class Adapter extends VanzareBilete implements EBilet {

    @Override
    public void cumparareBilet(String meci, int cantitate) {
        this.vanzareBilete(meci, cantitate);
    }
}
