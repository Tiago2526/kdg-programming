package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Reeksen {
    public static void main(String[] args) {
        int aantal;
        int start;
        int stapgrootte;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel getallen wil je afgedrukken? ");
        aantal = sc.nextInt();

        System.out.print("Met welke waarde wil je starten? ");
        start = sc.nextInt();;

        System.out.print("Met welke waarde wil je verhogen? ");
        stapgrootte = sc.nextInt();

        System.out.print(start + " ");

        for (int i = 0; i < aantal; i++) {
            start += stapgrootte;
            System.out.print(start + " ");
        }
    }
}
