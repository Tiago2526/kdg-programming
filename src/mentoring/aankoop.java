package mentoring;

import java.util.Scanner;

public class aankoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double product1, product2, product3, tootal;
        double eindPijs;
        double korting = 0;


        System.out.print("Geef de prijs voor eerste product?: ");
        product1 = sc.nextInt();
        product1 = checkPrijsen(product1);
        product1 =berekenBtw(product1);

        System.out.print("Geef de prijs voor tweede product?: ");
        product2 = sc.nextInt();
        product2 = checkPrijsen(product2);
        product2 =berekenBtw(product2);

        System.out.print("Geef de prijs voor derde product?: ");
        product3 = sc.nextInt();
        product3 = checkPrijsen(product3);
        product3 = berekenBtw(product3);

        tootal = product1 + product2 + product3;
        System.out.println("Totaal prijs: " + tootal);
        if (tootal > 100) {
            korting = tootal * 0.10;
        }
        System.out.println("Korting toegepast: " + korting);

        eindPijs = tootal - korting;
        System.out.println("Eindprijs: " + eindPijs);
        if (eindPijs == 0) {
            System.out.println("Geen product gekocht");
        } else if (eindPijs > 200) {
            System.out.println("U krijgt een extra geschenk!");
        }

    }


    public static double checkPrijsen(double product) {
        if (product <= 0) {
            System.out.println("Ongeldige prijs, wordt op 0 gezet.");
            return 0;
        }
        return product;
    }

    public static double berekenBtw(double product) {
        double btw = product * 0.21;
        product = product + btw;

        System.out.println("Prijs incl. BTW: " + product);
        return product;
    }
}
