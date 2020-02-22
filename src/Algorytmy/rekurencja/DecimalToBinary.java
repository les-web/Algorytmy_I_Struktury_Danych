package Algorytmy.rekurencja;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n;
        System.out.println("Podaj n ");
        n = scanner.nextInt();
        System.out.println("Binary " + decimalToBinary(n));
        for (int i = 0; i <=n ; i++) {
            System.out.println("Decimal  "+ i + "  = binary  "+decimalToBinary(i));

        }
    }

    static int decimalToBinary(int dec) {
        if (dec == 0) {
            return 0;
        } else {
            return (dec % 2 + 10 * decimalToBinary(dec / 2));
        }
    }
}
