package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ETipComponenta> listaTipuri = new ArrayList<>();
        listaTipuri.add(ETipComponenta.IMG); 
        listaTipuri.add(ETipComponenta.TEXT); 
        listaTipuri.add(ETipComponenta.VIDEO);
        
        List<String> listaBlack = new ArrayList<>();
        listaBlack.add("url1");
        listaBlack.add("url2");

        List<String> listWhite = new ArrayList<>();
        listaBlack.add("url1");
        listaBlack.add("url2");

        List<IComponenta> listaComponente = new ArrayList<>();
        listaComponente.add(new Componenta("Continut1", ETipComponenta.TEXT, true));
        listaComponente.add(new Componenta("Continut2", ETipComponenta.VIDEO, true));

        Client c = new Client("Client1", listaTipuri, listaBlack, listWhite, true, true);

        Browser browser = new Browser(c);
        Pagina pagina = new Pagina(listaComponente, "http://url1.com");
        browser.incarcaPagina(pagina);
    }
}
