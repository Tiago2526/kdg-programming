package eerste_oefeningen.Iteraties_en_Condities;

import java.util.Scanner;

public class Cowsay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zin;

        System.out.print("Geef een zin: ");
        zin = sc.nextLine();

        System.out.println("< " + zin + " >\n" +
                "----------------------\n" +
                "     \\   ^__^\n" +
                "      \\  (oo)\\_______\n" +
                "         (__)\\       )\\/\\\n" +
                "          U ||----w |\n" +
                "            ||      ||");
    }
}
