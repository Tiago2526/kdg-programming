package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Sommeren {
    public static void main(String[] args) throws InterruptedException {
        double first;
        double som = 0;
        int aantal = 0;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (run){
            do{
                System.out.print("Geef een getal (stop met 0): ");
                first = sc.nextDouble();

                som = first + som;
                aantal++;
            } while (!(first == 0));

            System.out.println("Aantal gegeven getallen: " + aantal);
            System.out.println("De som van deze getallen is: " + som);
            System.out.print("Nog is?: ");
            String answer = sc.nextLine();
            sc.nextLine();


            if (answer.equalsIgnoreCase("n")) {
                run = false;
            } else if (answer.equalsIgnoreCase("j")) {
                run = true;
            }
        }
    }
}
