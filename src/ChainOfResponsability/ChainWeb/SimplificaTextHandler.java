package ChainOfResponsability.ChainWeb;

public class SimplificaTextHandler implements IHandler {
    private IHandler next;

    @Override
    public void gestioneazaCerere(WebPage webPage) {
        for (Item item : webPage.items) {
            if (item instanceof Text) {
                Text text = (Text) item;
                text.setFontStyle(FontStyle.PLAIN);
            }
        }
        if (next != null) {
            next.gestioneazaCerere(webPage);
        }
    }

    @Override
    public void nextHandler(IHandler next) {
        this.next = next;
    }
}
