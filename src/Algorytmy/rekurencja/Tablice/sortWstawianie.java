package Algorytmy.rekurencja.Tablice;

import java.util.Arrays;

public class sortWstawianie {

    public static void main(String[] args) {

        int[] a = {54, 26, 22,300,93, 1,1,1,17, 77, 31,300, 1,22,44, 55, 20};
        System.out.println(Arrays.toString(a));
        sortByInserting(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sortByInserting(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            int pom = inputArray[i];
            int j = i;
            while (j>0 && pom < inputArray[j-1] ) {
                TabHelper.swap(inputArray, j, j-1);
                j=j-1;
            }

        }


    }

}

