package ChainOfResponsability.ChainWebBrowserOnline;

public class DecizieBlackList extends AHandler {

    @Override
    public boolean filtrarePagina(IPagina pagina, IClient c) {
        for (String url : c.getBlackList()) {
            if(pagina.getURL().contains(url)){
                return false;
            }
        }
        if(nextHandler != null){
            return nextHandler.filtrarePagina(pagina, c);
        }
        return true;
    }
    
}
