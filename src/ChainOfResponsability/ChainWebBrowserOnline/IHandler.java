package ChainOfResponsability.ChainWebBrowserOnline;

public interface IHandler {
	void setNextHandler(IHandler handler);
	boolean filtrarePagina(IPagina pagina,IClient c);
}
