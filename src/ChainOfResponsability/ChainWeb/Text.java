package ChainOfResponsability.ChainWeb;

public class Text implements Item {
    private FontStyle fontStyle;

    public Text(FontStyle style) {
        this.fontStyle = style;
    }

    public void setFontStyle(FontStyle style) {
        this.fontStyle = style;
    }
}
