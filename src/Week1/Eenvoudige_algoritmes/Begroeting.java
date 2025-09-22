package Week1.Eenvoudige_algoritmes;

import java.util.Scanner;

public class Begroeting {
    public static void main(String[] args) {
        String naam;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        naam = input.nextLine();

        System.out.println("Welcome " + naam);
    }
}
