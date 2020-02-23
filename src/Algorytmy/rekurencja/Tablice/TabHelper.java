package Algorytmy.rekurencja.Tablice;

import java.util.Arrays;

public class TabHelper {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(a));
        swap (a, 0, 7);
        System.out.println(Arrays.toString(a));
    }
    public static void swap(int[] inputArray, int indexA, int indexB) {
        int pom;
        pom = inputArray[indexA];
        inputArray[indexA] = inputArray[indexB];
        inputArray[indexB] = pom;
    }
}
