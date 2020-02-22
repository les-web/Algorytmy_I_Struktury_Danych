package Algorytmy;

import java.util.Scanner;

public class Srednia {

    public static void main(String[] args) {
        srednia();

    }

    private static void srednia() {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int input = 0;
        int ilosc = 0;
        System.out.println("Podawaj liczby naturalne, 0 konczy podawanie");
        input = scanner.nextInt();
        while (input != 0) {
            suma = suma + input;
            ilosc = ilosc + 1;
            input = scanner.nextInt();
        }
        int srednia = suma / ilosc;
        System.out.println("Podano " + ilosc + "   liczb roznych od 0. Ich srednia to " + srednia);
    }
}
