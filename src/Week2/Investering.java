package Week2;

import java.util.Scanner;

public class Investering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hoofdsom, jaarlijkseRent;
        int hoelang;

        System.out.print("Wat is de initiële investering: ");
        hoofdsom = sc.nextInt();

        System.out.print("Het jaarlijkse rentpercentage: ");
        jaarlijkseRent = sc.nextInt();

        System.out.print("Aantal jaren dat het geld wordt vastgehouden: ");
        hoelang = sc.nextInt();

        System.out.print("Welke valuta gebruik je? ");
        sc.nextLine();
        String valuta = sc.nextLine();

        double eindsaldo = hoofdsom * Math.pow((1 + jaarlijkseRent/100), hoelang);
        System.out.println("Eindesaldo = " + valuta + " " + eindsaldo);
    }
}
