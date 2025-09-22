package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class StartToRun {
    public static void main(String[] args) {
        int leeftijd;
        int hartslag;
        int keuze;
        int idealeHartslag = -1;
        int maximaalHartslag;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");

        System.out.print("Geef je leeftijd: ");
        leeftijd = sc.nextInt();

        System.out.print("Geef je hartslag in rust: ");
        hartslag = sc.nextInt();

        System.out.println("Welk soort training wil je doen? \n" +
                "1 : recuperatie training \n" +
                "2 : LSD training (Long Slow Distance) \n" +
                "3 : extensieve uithouding \n" +
                "4 : intensieve uithouding \n" +
                "5 : tempo-interval \n" +
                "6 : intensieve interval \n" +
                "Maak je keuze: ");
        keuze = sc.nextInt();
        
        maximaalHartslag = 220 - leeftijd;

        if (keuze == 1) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 65 / 100;
        } else if (keuze == 2) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 70 / 100;
        } else if (keuze == 3) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 75 / 100;
        } else if (keuze == 4) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 85 / 100;
        } else if (keuze == 5) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 90 / 100;
        } else if (keuze == 6) {
            idealeHartslag = hartslag + (maximaalHartslag - hartslag) * 95 / 100;
        } else {
            System.out.println("Something went wrong!");
            System.exit(0);
        }

        System.out.println("Je maximale hartslag is " + maximaalHartslag);

        System.out.println("Je traint best met een hartslag rond de " + idealeHartslag);
    }
}
