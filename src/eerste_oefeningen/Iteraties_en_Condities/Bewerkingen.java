package eerste_oefeningen.Iteraties_en_Condities;

import java.util.Scanner;

public class Bewerkingen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal1;
        int getal2;
        int bewerking;
        double resultaat;
        boolean check = false;

        System.out.print("Geef een getal: ");
        getal1 = sc.nextInt();

        System.out.print("Geef me andere getal: ");
        getal2 = sc.nextInt();

        System.out.println("kies een bewerking (in nummer): ");
        System.out.println("1 optellen \n" +
                "2 aftrekken \n" +
                "3 vermenigvuldigen \n" +
                "4 delen");
        bewerking = sc.nextInt();


        while (!check) {
            if (bewerking == 1) {
                resultaat = getal1 + getal2;
                System.out.println("Jouw keuze: " + bewerking + "\n" + getal1 + " + " + getal2 + " = " + resultaat);
                check = true;
            } else if (bewerking == 2) {
                resultaat = getal1 - getal2;
                System.out.println("Jouw keuze: " + bewerking + "\n" + getal1 + " - " + getal2 + " = " + resultaat);
                check = true;
            } else if (bewerking == 3) {
                resultaat = getal1 * getal2;
                System.out.println("Jouw keuze: " + bewerking + "\n" + getal1 + " * " + getal2 + " = " + resultaat);
                check = true;
            } else if (bewerking == 4) {
                resultaat = (double) getal1 / getal2;
                System.out.println("Jouw keuze: " + bewerking + "\n" + getal1 + " / " + getal2 + " = " + resultaat);
                check = true;
            }
        }
    }
}
