package listadwukierunkowa;

public class Element {


    private String napis;
    private Element nastepny;
    private Element poprzedni;

    public Element() {
        nastepny = null;
        poprzedni = null;
    }

    public Element(String napis, Element nastepny, Element poprzedni) {
        this.napis = napis;
        this.nastepny = nastepny;
        this.poprzedni = poprzedni;
    }

    public String pobierzNapis() {
        return napis;
    }

    public Element pobierzNastepny() {
        return nastepny;
    }

    public void ustawNastepny(Element nastepny) {
        this.nastepny = nastepny;
    }

    public Element pobierzPoprzedni() {
        return poprzedni;
    }

    public void ustawPoprzedni(Element poprzedni) {
        this.poprzedni = poprzedni;
    }
}
