package Algorytmy.rekurencja.Tablice;

import java.util.Random;

public class binarySearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int szukane = 7;
        Random random = new Random();
        szukane = random.nextInt(20);
        System.out.println("Szukam "+ szukane);
        int b = isInArray(a, szukane);
        if (b != -1) {
            System.out.println("Znaleziono, indeks to  " + b);
        } else {
            System.out.println("Nie znaleziono");
        }
    }

    public static int isInArray(int[] a, int l) {
        /*
        param tablica a
        param szukanaliczba
        zwraca indeks znalezionego elementu lub -1 gdy brak
         */
        int left = 0;
        int right = a.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;
            if (a[middle] == l) {
                return middle;
            }
            if (a[middle] > l) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
