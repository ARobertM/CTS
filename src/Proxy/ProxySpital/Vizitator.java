package Proxy.ProxySpital;

public class Vizitator {
    private String numeViz;
    private boolean areScrisoare;
    private boolean scrisoareVerificata;


    public Vizitator(String numeViz, boolean areScrisoare) {
        this.numeViz = numeViz;
        this.areScrisoare = areScrisoare;
        this.scrisoareVerificata = false;
    }

    public String getNumeViz() {
        return numeViz;
    }


    public boolean isAreScrisoare() {
        return areScrisoare;
    }


    public boolean isScrisoareVerificata() {
        return scrisoareVerificata;
    }
    


    @Override
    public String toString() {
        return "Vizitator [numeViz=" + numeViz + ", areScrisoare=" + areScrisoare + ", scrisoareVerificata="
                + scrisoareVerificata + "]";
    }

    public void setNumeViz(String numeViz) {
        this.numeViz = numeViz;
    }

    public void setAreScrisoare(boolean areScrisoare) {
        this.areScrisoare = areScrisoare;
    }

    public void setScrisoareVerificata(boolean scrisoareVerificata) {
        this.scrisoareVerificata = scrisoareVerificata;
    }    
}
