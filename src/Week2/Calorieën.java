package Week2;

import Week1.Eenvoudige_algoritmes.Leeftijd;

import java.util.Scanner;

public class Calorieën {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long GEMIDDELDE_CALORIEEN = 2256L;
        final long CALORIEEN_IN_PIZZA = 906L;
        final long MINIMUM_INWONERS = 1_000_000L;

        String land;
        long aantalMensen, tootalCalorieen, aantalPizza;

        System.out.print("Geef de naam van het land: ");
        land = sc.nextLine();

        System.out.printf("Hoelveel mensen wonen er in %s? ",land);
        aantalMensen = sc.nextLong();

        while (aantalMensen < MINIMUM_INWONERS) {
            System.out.printf("Fout! Dit getal is veel te klein!\n" +
                    "Hoelveel mensen wonen er in %s? " ,land);
            aantalMensen = sc.nextLong();
        }

        tootalCalorieen = aantalMensen * GEMIDDELDE_CALORIEEN;
        System.out.printf("In België verbruiken alle inwoners samen %d calorieën per dag. \n", tootalCalorieen);

        aantalPizza = tootalCalorieen / CALORIEEN_IN_PIZZA;
        System.out.printf("Dat komt overeen met %d pizza’s per dag.", aantalPizza);

    }
}
