package eerste_oefeningen.Eenvoudige_algoritmes;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        int gewicht;
        double lengte;
        Scanner sc = new Scanner(System.in);

        System.out.println("Beste patient, dit programma berekent je eerste_oefeningen.Eenvoudige_algoritmes.BMI");

        System.out.println("Geef je gewicht: ");
        gewicht = sc.nextInt();

        System.out.println("Geef je lengte in meter: ");
        lengte = sc.nextDouble();

        double BMI = gewicht / (lengte * lengte);
        System.out.println("eerste_oefeningen.Eenvoudige_algoritmes.BMI is " + BMI);
    }
}
