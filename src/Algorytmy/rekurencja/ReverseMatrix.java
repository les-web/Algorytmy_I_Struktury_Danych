package Algorytmy.rekurencja;

import java.util.Arrays;

public class ReverseMatrix {
    static public void main(String[] args) {
        int [] tablica = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(tablica));
        reverseMatrix(tablica, 0); // odwracamy element nr 0 i ostatni, wywolujac kolejno 1 i n-1,2 n-2
        System.out.println(Arrays.toString(tablica));
    }

    /*
       1.	Załóżmy, że chcemy odwrócić w sposób rekurencyjny tablicę liczb całkowitych.
       Zaproponuj algorytm z użyciem rekurencji, który wykona to zadanie
        */
    static void reverseMatrix(int [] tablica, int whichPair) {
       // tablica wejsciowa tab oraz numer elementu dla ktorego inwerja
        // zamieniamy parami
        int j = tablica.length - 1 - whichPair; //
        if (whichPair >= j) return;
        int pom = tablica[whichPair];
        tablica[whichPair] = tablica[j];
        tablica[j] = pom;
        reverseMatrix(tablica, whichPair + 1); // wywolujemy dla nastepnej pary
    }
}
