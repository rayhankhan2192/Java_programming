package basicjava;
import java.util.Scanner;
public class J7Userinput {
    public static void main(String[] srgs){
        Scanner input = new Scanner(System.in);
        String name,father_name,mother_name;
        short age,roll,classs;
        System.out.print("\nEnter your name: ");
        name = input.nextLine();
        System.out.print("Enter your Class: ");
        classs = input.nextShort();
        System.out.print("Enter your roll: ");
        roll = input.nextShort();
        System.out.print("Enter your age: ");
        age = input.nextShort();
        input.nextLine();//Flash the console to scan string after integer
        System.out.print("Enter your father name: ");
        father_name = input.nextLine();
        System.out.print("Enter your Mother name: ");
        mother_name = input.nextLine(); 

        System.out.println("\n\nYour Name       : "+name);
        System.out.println("Your Class      : "+classs);
        System.out.println("Your Roll       : "+roll);
        System.out.println("Your Age        : "+age);
        System.out.println("Your Father Name: "+father_name);
        System.out.println("Your Mother Name: "+mother_name);
        input.close();
    }
    
}
