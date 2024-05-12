package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.List;

public class Pagina implements IPagina {
    private List<IComponenta> listaComponente;
    private String URL;

    
    public Pagina(List<IComponenta> listaComponente, String uRL) {
        this.listaComponente = listaComponente;
        URL = uRL;
    }

    @Override
    public void getContinut() {
       System.out.println(this.toString());
        
    }

    @Override
    public List<IComponenta> getListaComponente() {
        return this.listaComponente;
    }

    @Override
    public String getURL() {
        return this.URL;
    }

    @Override
    public String toString() {
        return "Pagina [listaComponente=" + listaComponente + ", URL=" + URL + "]";
    }
    
    
}
