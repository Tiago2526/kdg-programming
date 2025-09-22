package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Kassa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double seniorenKorting = 0, groepKorting = 0;

        System.out.print("Aantal kinderen <1m: ");
        int kinderen = sc.nextInt();

        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        int kinderen2 = sc.nextInt();

        System.out.print("Aantal volwassenen: ");
        int volawssenen = sc.nextInt();

        System.out.println("Aantal senioren (55+): ");
        int senioren = sc.nextInt();

        int groep = kinderen + kinderen2 + volawssenen + senioren;

    }
}
