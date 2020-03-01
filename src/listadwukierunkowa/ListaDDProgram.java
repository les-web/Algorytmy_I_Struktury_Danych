package listadwukierunkowa;

public class ListaDDProgram {


    public static void main(String[] args) {
        ListaDD lista = new ListaDD();
        lista.wstaw("Jan Kowalski");
        lista.wstaw("Jan Wiśniewski");
        lista.wstaw("Jan Szczebrzeszczyński");
        lista.wstaw("Adam Cabacki");
        lista.wstaw("Adam Babacki");
        lista.wstaw("Jan Kiepura");
        lista.wstaw("Bronek Baronek");
        lista.wstaw("Bronek Bilonek");
        lista.rozmiar();
        lista.wyswietlOdPoczatku();
        lista.usun("Jan Kiepura");
        lista.rozmiar();
        lista.wyswietlOdKonca();
    }
}