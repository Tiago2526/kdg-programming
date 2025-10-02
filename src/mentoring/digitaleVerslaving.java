package mentoring;

import java.util.Scanner;

//done upbreiding tot c

public class digitaleVerslaving {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = 1, badresult = 0;
        double percentage;
        boolean result = false;

        while (true) {
            System.out.println("Wat is jouw naam?");
            String naam = sc.nextLine().toLowerCase();

            System.out.println("Antwoord de volgende vragen met ja of nee");
            System.out.println("Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets aan berichten, enz is binnengekomen op mijn smartphone.");
            antwoordChecken(sc.nextLine());

            System.out.println("Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn binnengekomen op mijn smartphone.");
            antwoordChecken(sc.nextLine());

            System.out.println("Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone.");
            antwoordChecken(sc.nextLine());

            System.out.println("Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is.");
            antwoordChecken(sc.nextLine());

            System.out.println("Terwijl is naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone.");
            antwoordChecken(sc.nextLine());

            System.out.println("Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.");
            antwoordChecken(sc.nextLine());

            System.out.println("Als ik in gezelschap -familie, vrienden,… eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.");
            antwoordChecken(sc.nextLine());

            System.out.println("Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone.");
            antwoordChecken(sc.nextLine());

            System.out.println("Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm.");
            antwoordChecken(sc.nextLine());

            System.out.println("Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken.");
            antwoordChecken(sc.nextLine());

            switch (count) {
                case 0:
                    System.out.println(naam + ", Je bent niet digitaal verslaafd. Houden zo!");
                    result = false;
                    break;
                case 1, 2:
                    System.out.println(naam + ", Je hebt een milde vorm van digitale verslaving.");
                    result = false;
                    break;
                case 3, 4, 5:
                    System.out.println(naam + ", Je hebt een niet te onderschatten vorm van digitale verslaving. Leg jezelf wat beperkingen op.");
                    result = false;
                    break;
                case 6, 7, 8:
                    System.out.println(naam + ", Je hebt een ernstige vorm van digitale verslaving. Overweeg om een digitale detox-cursus te volgen!");
                    result = true;
                    break;
                default:
                    System.out.println(naam + ", Je hebt een extreme vorm van digitale verslaving. Je hebt waarschijnlijk professionele hulp nodig!");
                    result = true;
                    break;
            }

            if (result) {
                badresult++;
            }


            System.out.println("Wilt je de enquête opnieuw maken?\n Antwoord met J of N.");
            if (sc.nextLine().equals("J")) {
                userCount++;
                break;
            } else {
                percentage = ((double) badresult / userCount) * 100;
                System.out.println("Deze enquête werd reeds door " + userCount + "  gebruikers ingevuld, " + percentage + " % hiervan had een ernstige of extreme vorm van digitale verslaving");
            }
        }
    }

    public static void antwoordChecken(String antwoord) {
        if (antwoord.equalsIgnoreCase("ja")) {
            count++;
        }
    }
}
