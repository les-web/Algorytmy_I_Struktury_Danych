package listadwukierunkowa;

public class ListaDD {

    private Element poczatek;
    private Element koniec;

    public ListaDD() {
        poczatek = null;
        koniec = null;
    }

    public void wstaw(String napis) {
        Element Element = new Element(napis, null, null);
        if (czyPusta()) {
            poczatek = Element;
            koniec = Element;
        } else {
            Element pomoc = poczatek;
            while (pomoc != null) {
                if ((pomoc.pobierzNapis()).compareToIgnoreCase(napis) < 0) {
                    pomoc = pomoc.pobierzNastepny();
                } else {
                    if (pomoc == poczatek) {
                        Element.ustawNastepny(pomoc);
                        pomoc.ustawPoprzedni(Element);
                        poczatek = Element;
                        break;
                    } else {
                        Element.ustawNastepny(pomoc);
                        Element.ustawPoprzedni(pomoc.pobierzPoprzedni());
                        (pomoc.pobierzPoprzedni()).ustawNastepny(Element);
                        pomoc.ustawPoprzedni(Element);
                        break;

                    }
                }
            }
            if (pomoc == null) {
                koniec.ustawNastepny(Element);
                Element.ustawPoprzedni(koniec);
                koniec = Element;
            }

        }

    }

    public void usun(String napis) {
        Element pomoc = poczatek;
        while (pomoc != null) {
            if (pomoc.pobierzNapis() == napis) {
                if (pomoc == poczatek) {
                    poczatek = (pomoc.pobierzNastepny());
                    break;
                } else if (pomoc == koniec) {
                    koniec = (pomoc.pobierzPoprzedni());
                    break;
                } else {
                    (pomoc.pobierzPoprzedni()).ustawNastepny(pomoc.pobierzNastepny());
                    (pomoc.pobierzNastepny()).ustawPoprzedni(pomoc.pobierzPoprzedni());
                    break;
                }
            }
            pomoc = pomoc.pobierzNastepny();
        }
        if (pomoc == null) {
            System.out.println();
            System.out.println("Wyraz " + napis + " nie znajduje sie na liście");
        }
    }

    public boolean czyPusta() {
        return (poczatek == null);
    }

    public void wyswietlOdPoczatku() {
        Element pomoc = poczatek;
        System.out.println("Lista ułożona alfabetycznie od początku: ");
        while (pomoc != null) {
            System.out.print(pomoc.pobierzNapis() + "   ");
            pomoc = pomoc.pobierzNastepny();
        }
        System.out.println();
    }

    public void wyswietlOdKonca() {
        Element pomoc = koniec;
        System.out.println("Lista ułożona alfabetycznie od końca: ");
        while (pomoc != null) {
            System.out.print(pomoc.pobierzNapis() + "   ");
            pomoc = pomoc.pobierzPoprzedni();
        }
        System.out.println();
    }

    public void rozmiar() {
        Element pomoc = poczatek;
        int i = 0;
        while (pomoc != null) {
            i++;
            pomoc = pomoc.pobierzNastepny();
        }
        System.out.println("Rozmiar listy: " + i);
    }
}
