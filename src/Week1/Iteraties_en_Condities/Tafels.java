package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;

        while (true) {
            System.out.print("Welke tafel wil je krijgen? ");
            answer = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + answer + " = " + i * answer);
            }

            System.out.print("Wenst u nog een tafel af te drukken (j/n): ");
            String answer2 = sc.next();

            if (answer2.equals("n")){
                break;
            }
        }
    }
}
