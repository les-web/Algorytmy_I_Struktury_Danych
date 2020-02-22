package Algorytmy;


public class algorytmy {

    public static void main(String[] args) {
// znajdowanie największego wspólnego mianownika metodą Euklidesa

        int a = 378;
        int b = 214;
        int c = 0;
        int steps = 0;
        while (b > 0) {
            c = b;
            b = a % b;
            a = c;
            steps = steps + 1;

        }
        System.out.println(" NWD = " + a);
        System.out.println(" Number of steps =" + steps);

        a = 378;
        b = 214;
        steps = 0;
        while (a != b) {
            if (a < b) {
                b = (b - a);
            } else {
                a = a - b;
            }
            steps = steps + 1;

        }
        System.out.println(" NWD = " + a);
        System.out.println(" Steps = " + steps);
    }
}