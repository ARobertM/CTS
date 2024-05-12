package ChainOfResponsability.ChainWebBrowserOnline;

public class Componenta implements IComponenta {

    private String continut;
    private ETipComponenta tipComponenta;
    private boolean eColorat;

    

    public Componenta(String continut, ETipComponenta tipComponenta, boolean eColorat) {
        this.continut = continut;
        this.tipComponenta = tipComponenta;
        this.eColorat = eColorat;
    }
    

    @Override
    public String getContinut() {
        return this.continut;
    }

    @Override
    public ETipComponenta getTipComponenta() {
        return this.tipComponenta;
    }


    public void setContinut(String continut) {
        this.continut = continut;
    }

    @Override
    public String toString() {
        return "Componenta [continut=" + continut + ", tipComponenta=" + tipComponenta + ", eColorat=" + eColorat + "]";
    }


    public void setTipComponenta(ETipComponenta tipComponenta) {
        this.tipComponenta = tipComponenta;
    }


    public void seteColorat(boolean eColorat) {
        this.eColorat = eColorat;
    }


    public boolean iseColorat() {
        return eColorat;
    }
    
}
