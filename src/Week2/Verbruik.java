package Week2;

import java.util.Scanner;

public class Verbruik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vorigeTankbeurt, huidigeKilometerstand, afstand;
        double getankteLiters, verbruik;

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeTankbeurt = sc.nextInt();

        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKilometerstand = sc.nextInt();

        System.out.print("Geef het aantal getankte liters: ");
        getankteLiters = sc.nextDouble();

        afstand = huidigeKilometerstand - vorigeTankbeurt;
        verbruik = (getankteLiters / afstand) * 100;

        System.out.printf("Verbruik voor %d km: %.2f liter/100km", afstand, verbruik);
    }
}
