package ChainOfResponsability.ChainWebBrowserOnline;

public class Browser {
	private IClient client;
	private AHandler handler;

	public Browser(IClient client) {
		super();
		this.client = client;
	}

	private void stabilesteChain(){
		AHandler blackListHandler = new DecizieBlackList();
		AHandler coloHandler = new EliminareCuloare();
		AHandler componenteHandler = new EliminareComponenta();
		AHandler whiteListHandler = new DecizieWhiteList();

		if(client.esteSecurizat()){
			blackListHandler.setNextHandler(blackListHandler);
			coloHandler.setNextHandler(whiteListHandler);
			whiteListHandler.setNextHandler(componenteHandler);
			this.handler = blackListHandler;
		}else{
			coloHandler.setNextHandler(componenteHandler);
			this.handler = coloHandler;
		}
	}
	
	public void incarcaPagina(IPagina pagina) {
		stabilesteChain();
		pagina.getContinut();
	}
}
