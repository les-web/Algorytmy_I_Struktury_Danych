package Algorytmy.rekurencja;

import java.util.Scanner;

public class Potegowanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 4 *4 *4 *4 *4
        int podstawa;
        int potega;
        System.out.println("Podaj podstawe  ");
        podstawa  = scanner.nextInt();
        System.out.println("Podaj potege ");
        potega = scanner.nextInt();
        int wynik;
        wynik = poteguj (podstawa, potega);
        System.out.println(" Wynik = " + wynik);
    }

    private static int poteguj(int podstawa, int potega) {
        if (potega == 0) {
            return 1;
        } else
            return podstawa * poteguj(podstawa, potega - 1);
    }
}
