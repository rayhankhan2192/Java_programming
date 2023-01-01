/*Niloys basic salary is input through the keyboard.
His dearness allowance is 40% of his basic salary and house rent is 20% of his basic salary.
Write a program to calculate his gross salary */
package basicjava;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] srgs) {
        Scanner input = new Scanner(System.in);
        double dearness_allowance, house_rent, gross_salary;
        System.out.print("\nEnter Niloys Basic Salary: ");
        double basic_salary = input.nextDouble();
        dearness_allowance = 0.4 * basic_salary;
        house_rent = 0.2 * basic_salary;
        gross_salary = basic_salary - dearness_allowance - house_rent;
        System.out.println("Niloys Gross Salary: " + gross_salary);
        input.close();
    }
}
