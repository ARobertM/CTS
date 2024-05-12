package ChainOfResponsability.ChainWebBrowserOnline;

import java.util.List;

public interface IPagina {
	List<IComponenta> getListaComponente();
	String getURL();
	void getContinut();//sum la toate componentele paginii
}
