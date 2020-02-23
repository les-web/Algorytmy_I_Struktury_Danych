package Algorytmy.rekurencja.Tablice;

import java.util.Arrays;

public class sortWstawianie {

    public static void main(String[] args) {

        int[] a = {54, 26, -77, 22, 300, 93, 1, 1, 1, 17, 77, -10, -33, 31, 300, 1, 22, 44, 55, 20, 2, 456, 3, 700, 7};
        System.out.println("Tablica wejściowa");
        System.out.println(Arrays.toString(a));
        System.out.println("Tablica posortowana metoda wstawiania");

        sortByInserting(a);
        System.out.println(Arrays.toString(a));

        int b[] = {54, 26, -77, 22, 300, 93, 1, 1, 1, 17, 77, -10, -33, 31, 300, 1, 22, 444, 44, 55, 20, 2, 456, 3, 700, 7};
        System.out.println("Tablica wejściowa");
        System.out.println(Arrays.toString(b));
        sortByBubbling(b);
        System.out.println("Tablica posrtowana metoda babelkowania");
        System.out.println(Arrays.toString(b));


    }

    public static void sortByInserting(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            int pom = inputArray[i];
            int j = i;
            while (j > 0 && inputArray[j - 1] > pom) {
                TabHelper.swap(inputArray, j, j - 1);
                j = j - 1;
            }

        }
    } // end of sortByInserting

    public static void sortByBubbling(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    TabHelper.swap(inputArray, j, j + 1);
                }

            }

        }
    }  // end of sort by bubbling


}

