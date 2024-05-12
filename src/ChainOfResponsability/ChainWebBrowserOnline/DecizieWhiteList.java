package ChainOfResponsability.ChainWebBrowserOnline;

public class DecizieWhiteList extends AHandler {

    @Override
    public boolean filtrarePagina(IPagina pagina, IClient c) {
        
        for (String url : c.getWhiteList()) {
            if(!pagina.getURL().contains(url)){
                return false;
            }
        }
        if(nextHandler != null){
            return nextHandler.filtrarePagina(pagina, c);
        }
        return true;
    }
    
}
