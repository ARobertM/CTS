package Flyweight.FlyweightReteta;

import java.util.List;

public class Reteta {
    private List<String> listaMedicamente;
    private String diagnostic;
    private String data;

    public Reteta(List<String> listaMedicamente, String diagnostic, String data) {
        this.listaMedicamente = listaMedicamente;
        this.diagnostic = diagnostic;
        this.data = data;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Reteta [listaMedicamente=" + listaMedicamente + ", diagnostic=" + diagnostic + ", data=" + data + "]";
    }
}
