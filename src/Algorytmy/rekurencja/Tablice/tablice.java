package Algorytmy.rekurencja.Tablice;

import java.util.Arrays;

public class tablice {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Odwracanie tablicy ");
        System.out.println(Arrays.toString(tablica));
        int[] wyjscie = new int[tablica.length];
        wyjscie = odwroc(tablica);
        System.out.println(Arrays.toString(wyjscie));

        System.out.println("Sumowanie elementow tablicy");
        int razem = sumaElementowWTablicy(wyjscie);
        System.out.println("Suma elementow tablicy = " + razem);
        //    int ilosc = wyjscie.length;
        //    double srednia = razem / ilosc;
        System.out.println("Srednia z wszystkich elementow tablicy = " + sredniaElementowWTablicy(wyjscie));


    }

    private static int[] odwroc(int[] a) {
        int[] b = new int[a.length];
        int ilosc = a.length - 1;
        for (int i = 0; i <= ilosc; i++) {
            b[ilosc - i] = a[i];
        }
        return b;
    }

    private static int sumaElementowWTablicy(int[] a) {
        int suma = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            suma = suma + a[i];
        }
        return suma;
    }

    private static double sredniaElementowWTablicy(int[] a) {
        int suma = sumaElementowWTablicy(a);
        double srednia = suma / a.length;
        return srednia;
    }
}
