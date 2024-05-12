package ChainOfResponsability.ChainWebBrowserOnline;

public abstract class AHandler implements IHandler{
	protected IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler handler) {
		this.nextHandler=handler;
	}
	
}
