package eerste_oefeningen.Eenvoudige_algoritmes;

import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        String naam;
        int geburtsdatum;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is je naam: ");
        naam = sc.nextLine();

        System.out.println("Beste " + naam + " geef je geboortejaar: ");
        geburtsdatum = sc.nextInt();

        int jaar = LocalDate.now().getYear() - geburtsdatum;
        System.out.println("Als alles goed loopt, word je die jaar " + jaar);
    }
}
