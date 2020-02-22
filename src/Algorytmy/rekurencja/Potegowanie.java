package Algorytmy.rekurencja;

public class Potegowanie {

    public static void main(String[] args) {

        // 4 *4 *4 *4 *4
        int wynik;
        wynik = poteguj(4, 5);
        System.out.println(" Wynik = " + wynik);
    }

    private static int poteguj(int podstawa, int potega) {
        if (potega == 0) {
            return 1;
        } else
            return podstawa * poteguj(podstawa, potega - 1);
    }
}
