package Algorytmy.rekurencja;

import java.util.Scanner;

public class Hanoi {
    /*
    9.	Napisz program realizujący wieże Hanoi
    1, n = 1
    2 * hanoi(n-1), n >1

     */

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        int n;
        System.out.println("Podaj n");
        System.out.println();
        n = scannner.nextInt();
        System.out.println("Dla n = " + n + " Hanoi = " + hanoi(n));
        for (int i = 1; i <= n ; i++) {
            System.out.println("Dla n = " + i + " Hanoi = " + hanoi(i));


        }
    }

    public static int hanoi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * hanoi(n - 1);
        }
    }
}