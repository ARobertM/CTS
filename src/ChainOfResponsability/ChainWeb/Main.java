package ChainOfResponsability.ChainWeb;

public class Main {
    public static void main(String[] args) {
        IHandler stergeImagini = new StergeImaginiHandler();
        IHandler simplificaText = new SimplificaTextHandler();

        stergeImagini.nextHandler(simplificaText);

        WebPage webPage1 = new WebPage();
        webPage1.items.add(new Text(FontStyle.BOLD));
        webPage1.items.add(new Image());

        stergeImagini.gestioneazaCerere(webPage1);
        System.out.println(webPage1.items.size());
    }
}
