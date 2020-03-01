package sortowanie;

import Algorytmy.rekurencja.Tablice.TabHelper;

public class InsertSort {

    public static void sort(int[] tab) {

        for (int i = 1; i < tab.length; i++) {
            int j = i;      // fragment [0, ..., i - 1] jest już posortowany
            int temp = tab[j];

            while (j > 0 && tab[j - 1] > temp) {
                TabHelper.swap(tab, j, j - 1);
                j--;
            }
        }
    }
}
