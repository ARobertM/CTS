package ChainOfResponsability.ChainWeb;

import java.util.List;

public class Request {
    public List<WebPageItem> items;
    public boolean isSlowConn;

    public Request(List<WebPageItem> items, boolean isSlowConn) {
        this.items = items;
        this.isSlowConn = isSlowConn;
    }

}
