package mainjava;

import java.util.Scanner;

public class Problem_4_mortage_calculator {
    public static void main(String[] srgs) {
        Scanner input = new Scanner(System.in);
        final byte Month_in_year = 12;
        final byte percentage = 100;
        int principal = 0;
        float annualInterest = 0, monthlyInterest = 0;
        while (true) {
            System.out.print("\nPrincipal Amount     : ");
            principal = input.nextInt();
            if (principal >= 10_000 && principal <= 50_000_00)
                break;
            System.out.println("Enter Amount between 10_000 - 50_000_00");
        }

        while (true) {
            System.out.print("Annual Interest Rate : ");
            annualInterest = input.nextFloat();
            if (annualInterest >= 5 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / percentage / Month_in_year);
                break;
            }
            System.out.println("Enter Value between 5 - 30");
        }
        System.out.print("Period(Year)         : ");
        int years = input.nextInt();
        int numberOfPayment = years * Month_in_year;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayment)))
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);

        System.out.println("\nMortgage\t     : " + mortgage);

        input.close();
    }
}
