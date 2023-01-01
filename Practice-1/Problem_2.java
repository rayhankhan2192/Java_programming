/*If the marks obtained by a student in five different subjects are input through the keyboard,
find out the aggregate marks and percentage marks obtained by the student.
Assume that the maximum marks that can be obtained by a student in each subject is 100.
And find subject grade */
package basicjava;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] srgs) {
        Scanner input = new Scanner(System.in);
        float physics, chemistry, math, zoology, botany;
        System.out.print("\nEnter Physics Number   : ");
        physics = input.nextFloat();
        System.out.print("Enter Chemistry Number : ");
        chemistry = input.nextFloat();
        System.out.print("Enter Math Number      : ");
        math = input.nextFloat();
        System.out.print("Enter Zoology Number   : ");
        zoology = input.nextFloat();
        System.out.print("Enter Botany Number    : ");
        botany = input.nextFloat();

        float total = physics + chemistry + math + zoology + botany;
        float average = total / 5;
        System.out.println("\nTotal Number     : " + total);
        System.out.println("Average Number   : " + average);
        System.out.print("\n");

        if (average >= 80)
            System.out.println("GPA   : 5.00\nStatus: A+");
        else {
            if (average >= 70 && average < 80)
                System.out.println("GPA   : 4.00\nStatus: A");
            else {
                if (average >= 60 && average < 70)
                    System.out.println("GPA   : 3.50\nStatus: A-");
                else {
                    if (average >= 50 && average < 60)
                        System.out.println("GPA   : 3.00\nStatus: B");
                    else {
                        if (average >= 40 && average < 50)
                            System.out.println("GPA   : 2.00\nStatus: c");
                        else {
                            System.out.println("Status: FAIL\n");
                        }
                    }
                }
            }
        }
        input.close();
    }

}