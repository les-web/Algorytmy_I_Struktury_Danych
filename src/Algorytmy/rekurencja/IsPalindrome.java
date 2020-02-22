package Algorytmy.rekurencja;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        /*
        7.	Napisz program rekurencyjny sprawdzający, czy słowo jest palindromem
         */
        Scanner scanner = new Scanner((System.in));
        String word = "gogogo";
        do {


            System.out.println("Input your word, exit finishes program. ");
            word = scanner.nextLine();

            if (word.startsWith("exit")) {
                break;
            }

            System.out.println(word);
            System.out.println(" Słowo " + word + "  to palindrom   " + isPalindrome(word));
        } while (true);
    }

    static boolean isPalindrome(String inputWord) {

        if (inputWord.length() == 0 || inputWord.length() == 1)
            return true;
        if (inputWord.charAt(0) == inputWord.charAt(inputWord.length() - 1))
            return isPalindrome(inputWord.substring(1, inputWord.length() - 1));
        return false;

    }
}
