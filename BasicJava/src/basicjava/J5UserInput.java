package basicjava;
import java.util.Scanner;
public class J5UserInput {
    public static void main(String[] srgs){
        Scanner input = new Scanner(System.in);
    
        int number_1;
        long number_2;
        double number_3;
        String str,number_4;
        
        System.out.print("Enter an string: ");
        str = input.nextLine();
        System.out.print("Enter an integer value: ");
        number_1 = input.nextInt();
        System.out.print("Enter an long value: ");
        number_2 = input.nextLong();
        System.out.print("Enter an double value: ");
        number_3 = input.nextDouble();
        input.nextLine();//
        System.out.print("Enter an String_2: ");
        number_4 = input.nextLine();
        
        System.out.println("\nThe integer value is: "+number_1);
        System.out.println("The long value is   : "+number_2);
        System.out.println("The double value is : "+number_3);
        System.out.println("The string is       : "+str);
        System.out.println("Second String       : "+number_4);

        input.close();
    }
}
