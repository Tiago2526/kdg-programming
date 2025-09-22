package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Middelste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;

        while (true) {
            System.out.print("Geef het eerste getal (1..100): ");
            number1 = sc.nextInt();

            if (number1 < 100 && number1 > 0)
                break;
            else {
                System.out.println("Het getal moet tussen 1 en 100 liggen! ");
            }
        }

        while (true) {
            System.out.print("Geef het tweede getal (1..100): ");
            number2 = sc.nextInt();

            if (number2 < 100 && number2 > 0)
                break;
            else {
                System.out.println("Het getal moet tussen 1 en 100 liggen! ");
            }
        }

        while (true) {
            System.out.print("Geef het derde getal (1..100): ");
            number3 = sc.nextInt();

            if (number3 < 100 && number3 > 0)
                break;
            else {
                System.out.println("Het getal moet tussen 1 en 100 liggen! ");
            }
        }

        if ( (number1 - number2) * (number3 - number1) >= 0 ) {
            System.out.println("Het middelste getal is " + number1);
        } else if ( (number2 - number1) * (number3 - number2) >= 0 ) {

            System.out.println("Het middelste getal is " + number2);
        } else {
            System.out.println("Het middelste getal is " + number3);
        }

        System.out.println("Einde programma");
    }
}
