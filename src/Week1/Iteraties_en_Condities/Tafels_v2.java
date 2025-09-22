package Week1.Iteraties_en_Condities;

import java.util.Scanner;

public class Tafels_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;

        while (true) {
            System.out.print("Welke tafel wil je krijgen? ");
            answer = sc.nextInt();

            int score = 0;

            for (int i = 0; i <= 10; i++) {
                while (true) {
                    int correctAnswer = i * answer;

                    System.out.print(i + " x " + answer + " = ");
                    int userAnswer = sc.nextInt();

                    if (userAnswer == correctAnswer) {
                        System.out.println("Correct!");
                        break;
                    }
                    score++;
                    System.out.println("Fout!");
                }

            }
            System.out.println("je maakte " + score + " fouten op de tafel van " + answer);

            System.out.print("Wenst u nog een tafel af te drukken (j/n): ");
            String answer2 = sc.next();

            if (answer2.equals("n")){
                break;
            }
        }
    }
}
