package eerste_oefeningen.Iteraties_en_Condities;

import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel heeft Yousra uitgeven? ");
        double bedrag1 = sc.nextDouble();

        System.out.print("Hoeveel heeft Quinten uitgegeven? ");
        double bedrag2 = sc.nextDouble();

        System.out.println("Hoeveel heeft 3rd persoon uitgegven");
        double bedrag3 = sc.nextDouble();

        double tootal = bedrag1 + bedrag2 + bedrag3;
        System.out.printf("In totaal werd er %.2f EUR uitgegeven", tootal);

        tootal = tootal / 3;
        System.out.printf("Dat is %.2f EUR per persoon \n", tootal);

        double yousra = tootal - bedrag1;
        

        System.out.printf("Yousra moet dus %.2f EUR betalen aan Quinten", yousra);
    
    }
}
