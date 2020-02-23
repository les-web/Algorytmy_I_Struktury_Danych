package Algorytmy.rekurencja.Tablice;

import java.util.Scanner;

public class wydajReszte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote reszty (liczba calkowita) ");
        int reszta = scanner.nextInt();
        int [] nominaly = {100,50,20,10,5,2,1};
        wydajReszte(reszta, nominaly);

    }
    private static void wydajReszte (int rest, int[] nom){
        int indeksNom=0;
        int ileRazy  =0;
        int nominal = 0;
        int reszta = rest;
        while (rest > 0 && indeksNom<nom.length){
            nominal = nom[indeksNom];
            ileRazy = reszta / nominal;
            if (ileRazy > 0) {
                reszta = reszta - ileRazy * nominal;
                System.out.println(nominal + "   *   "+ ileRazy);
            }
            indeksNom = indeksNom +1;


        }
    }
}
