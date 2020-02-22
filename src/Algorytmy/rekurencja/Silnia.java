package Algorytmy.rekurencja;


import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n;
        System.out.println("Podaj n ");
        n = scanner.nextInt();
//        System.out.println("Silnia od n = " + n + " wynosi " + silnia(n));
        //       for (int i = 1; i < 100; i++) {
        //           System.out.println("Silnia od n = " + i + " wynosi " + silnia(i));
        //         System.out.println("Podaj n ");
        //         n = scanner.nextInt();
        //      System.out.println("Suma dodawania 1+2+..+ " + n + " wynosi " + silniaDodawana(n));
        System.out.println("Fibonacci dla n =" + n + " wynosi " + fibonacci(n));
        for (int i = 1; i <= n; i++) {
            //          System.out.println("Suma dodawania od 1 do " + i + " wynosi " + silniaDodawana(i));
            System.out.println("Ciag Fibonacciego dla n = " + i + " wynosi " + fibonacci(i));
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Silnia dla n = " + i + " wynosi " + silniaMulti(i));
        }
    }

    public static int silnia(int n) {
        if (n == 0) {
            return 1;
        } else
            return (n * silnia(n - 1));

    }

    public static int silniaMulti(int n) {
        /*
        5.	Napisz program obliczający silnię bez użycia rekurencji
         */
        int pom = 1;
        if (n <= 0) {
        } else {
            for (int i = 1; i <= n; i++) {
                pom = pom * i;
            }

        }
        return pom;

    }

    public static int silniaDodawana(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n + silniaDodawana(n - 1));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

