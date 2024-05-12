package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.List;

public class Client implements IClient {
    private String numeClient;
    private List<ETipComponenta> listaPreferinta;
    private List<String> listaBlackList;
    private List<String> listaWhiteList;
    private boolean eColor;
    private boolean eSecuzrizat;

    
    public Client(String numeClient, List<ETipComponenta> listaPreferinta, List<String> listaBlackList,List<String> listaWhiteList, boolean eColor,
            boolean eSecuzrizat) {
        this.numeClient = numeClient;
        this.listaPreferinta = listaPreferinta;
        this.listaBlackList = listaBlackList;
        this.listaWhiteList = listaWhiteList;
        this.eColor = eColor;
        this.eSecuzrizat = eSecuzrizat;
    }
    
    @Override
    public boolean esteColor() {
        return this.eColor;
    }

    @Override
    public boolean esteSecurizat() {
       return this.eSecuzrizat;
    }

    @Override
    public List<String> getBlackList() {
        return this.listaBlackList;
    }

    @Override
    public List<ETipComponenta> getListaPreferinta() {
        return this.listaPreferinta;
    }

    @Override
    public String getNume() {
        return this.numeClient;
    }

    @Override
    public List<String> getWhiteList() {
        return this.listaWhiteList;
    }

    @Override
    public String toString() {
        return "Client [numeClient=" + numeClient + ", listaPreferinta=" + listaPreferinta + ", listaBlackList="
                + listaBlackList + ", listaWhiteList=" + listaWhiteList + ", eColor=" + eColor + ", eSecuzrizat="
                + eSecuzrizat + "]";
    }

    public String getNumeClient() {
        return numeClient;
    }

    public List<String> getListaBlackList() {
        return listaBlackList;
    }

    public List<String> getListaWhiteList() {
        return listaWhiteList;
    }

    public boolean iseColor() {
        return eColor;
    }

    public boolean iseSecuzrizat() {
        return eSecuzrizat;
    }

}
