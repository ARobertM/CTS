package ChainOfResponsability.ChainWebBrowserOnline;

public class EliminareCuloare extends AHandler {

    @Override
    public boolean filtrarePagina(IPagina pagina,IClient c) {
        if(c.esteColor()){
           for (IComponenta componeta : pagina.getListaComponente()) {
                if(((Componenta) c).iseColorat()){
                    ((Componenta) c).seteColorat(false);
                }
           } 
        }
        if(nextHandler != null){
            return nextHandler.filtrarePagina(pagina, c);
        }
        return true;
    }
    
}
