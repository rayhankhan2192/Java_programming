/*. Any integer is input through the keyboard. 
Write a program to find out whether itis an odd number or even number */

package mainjava;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] stgs) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Number-1: ");
        int num_1 = input.nextInt();
        System.out.print("Enter Number-2: ");
        int num_2 = input.nextInt();
        System.out.print("Enter Number-3: ");
        int num_3 = input.nextInt();
        if (num_1 % 2 == 0) {
            System.out.println("Number 1 is Even");
        } else if (num_1 % 2 != 0) {
            System.out.println("Number 1 is Odd");
        }
        if (num_2 % 2 == 0) {
            System.out.println("Number 2 is Even");
        } else if (num_2 % 2 != 0) {
            System.out.println("Number 2 is Odd");
        }
        if (num_3 % 2 == 0) {
            System.out.println("Number 3 is Even");
        } else if (num_3 % 2 != 0) {
            System.out.println("Number 3 is Odd");
        }
        input.close();
    }
    
}
