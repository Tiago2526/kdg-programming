package Week2;

import java.util.Scanner;

public class belasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double btwPercentage, bedrag, resultaat;
        int keuze;

        System.out.print("Geef het BTW percentage: ");
        btwPercentage = sc.nextDouble();

        System.out.print("Geef het bedrag in €: ");
        bedrag = sc.nextDouble();

        System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
        keuze = sc.nextInt();

        resultaat = berekenBelasting(btwPercentage, bedrag, keuze);
        if (resultaat < 0) {
            System.out.println("Fout keuze!");
        } else {
            if (keuze == 1) {
                System.out.println("€" + resultaat + " + " + btwPercentage + "% BTW = " + "€" + bedrag);
            } else {
                System.out.println("€" + bedrag + " + " + btwPercentage + "% BTW = " + "€" + resultaat);
            }
        }


    }

    public static double berekenBelasting (double btw, double bedrag, int keuze) {
        if (keuze == 2){
            return bedrag * (1 + btw / 100);
        } else if (keuze == 1) {
            return bedrag / (1 + btw / 100);
        } else {
            return -1;
        }
    }
}
