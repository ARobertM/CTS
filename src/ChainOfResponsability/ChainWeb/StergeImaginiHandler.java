package ChainOfResponsability.ChainWeb;

public class StergeImaginiHandler implements IHandler {
    private IHandler next;

    @Override
    public void nextHandler(IHandler next) {
        this.next = next;
    }

    @Override
    public void gestioneazaCerere(WebPage webPage) {
        webPage.items.removeIf(item -> item instanceof Image);
        if (next != null) {
            next.gestioneazaCerere(webPage);
        }
    }
}
