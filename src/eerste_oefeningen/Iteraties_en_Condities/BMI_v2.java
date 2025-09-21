package eerste_oefeningen.Iteraties_en_Condities;

import java.util.Scanner;

public class BMI_v2 {
    public static void main(String[] args) {
        int gewicht;
        double lengte;
        Scanner sc = new Scanner(System.in);

        System.out.println("Beste patient, dit programma berekent je eerste_oefeningen.Eenvoudige_algoritmes.BMI");

        System.out.print("Geef je gewicht: ");
        gewicht = sc.nextInt();

        System.out.print("Geef je lengte in meter: ");
        lengte = sc.nextDouble();

        double BMI = gewicht / (lengte * lengte);
        System.out.println("eerste_oefeningen.Eenvoudige_algoritmes.BMI is " + BMI);

        if (BMI < 18) {
            System.out.println("Dat is Ondergewicht");
        } else if (BMI >= 18 && BMI < 25) {
            System.out.println("Dat is In orde");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Dat is Overgewicht");
        } else if (BMI >= 30){
            System.out.println("Dat is Obesitas");
        }
    }
}
