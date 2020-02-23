package Algorytmy.rekurencja.Tablice;

public class binarySearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int szukane = 7;
        int b = isInArray(a, szukane);
        System.out.println("Znaleziono " + b);
    }

    public static int isInArray(int[] a, int l) {
        /*
        param tablica a
        param szukanaliczba
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
