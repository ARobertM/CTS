package ChainOfResponsability.ChainWeb;

public interface IHandler {
    void nextHandler(IHandler next);
    void gestioneazaCerere(WebPage webPage);
}
