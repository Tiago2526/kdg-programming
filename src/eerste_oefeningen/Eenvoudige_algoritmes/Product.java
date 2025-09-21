package eerste_oefeningen.Eenvoudige_algoritmes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Product {
    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);

        System.out.println("geef een getal: ");
        int a = scr.nextInt();

        System.out.println("geef nog een getal: ");
        int b = scr.nextInt();

        System.out.println("geef een laatste getal: ");
        int c = scr.nextInt();

        int result = a*b*c;
        System.out.println("het product is: " + result);
    }
}
