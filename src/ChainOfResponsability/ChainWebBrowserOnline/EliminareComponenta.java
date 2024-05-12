package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.List;

public class EliminareComponenta extends AHandler {

    @Override
    public boolean filtrarePagina(IPagina pagina, IClient c) {
        List<IComponenta> componentePagina = pagina.getListaComponente();
        List<ETipComponenta> componenteDePastrat = c.getListaPreferinta();

        boolean esteModificat;
        esteModificat = componentePagina.removeIf(componenta -> !componenteDePastrat.contains(componenta.getTipComponenta()));

        System.out.println("Componentele au fost modificate/elimante conform preferintelor clientului!");
        if(nextHandler != null){
            nextHandler.filtrarePagina(pagina, c);
        }
        return true;
    }
    
}
