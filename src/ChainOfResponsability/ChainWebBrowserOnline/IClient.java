package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.List;

public interface IClient {
	String getNume();
	List<ETipComponenta> getListaPreferinta();//returneaza tipurile de componente dorite
	boolean esteSecurizat();//adica daca se tine cont de black si white list
	boolean esteColor();//daca se doresc componentele color sau nu de catre client
	List<String> getBlackList();
	List<String> getWhiteList();
}
