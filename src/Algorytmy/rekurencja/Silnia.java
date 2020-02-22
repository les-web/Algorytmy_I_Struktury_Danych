package Algorytmy.rekurencja;


import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n;
        System.out.println("Podaj n ");
        n = scanner.nextInt();
        System.out.println("Silnia od n = " + n + " wynosi " + silnia(n));
        //       for (int i = 1; i < 100; i++) {
        //           System.out.println("Silnia od n = " + i + " wynosi " + silnia(i));
        //         System.out.println("Podaj n ");
        //         n = scanner.nextInt();
        System.out.println("Suma dodawania 1+2+..+ " + n + " wynosi " + silniaDodawana(n));
        for (int i = 1; i <= 100; i++) {
            System.out.println("Suma dodawania od 1 do " + i + " wynosi " + silniaDodawana(i));

        }
    }

    public static int silnia(int n) {
        if (n == 0) {
            return 1;
        } else
            return (n * silnia(n - 1));

    }

    public static int silniaDodawana(int n) {
        if (n == 0) {
            return 0;
        } else
            return (n + silniaDodawana(n - 1));


    }
}