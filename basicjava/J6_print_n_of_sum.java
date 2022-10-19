package basicjava;
import java.util.Scanner;
public class J6_print_n_of_sum {
    public static void main(String[] srgs){
        Scanner input = new Scanner(System.in);
        int value,i,sum = 0;
        System.out.print("Sum of n term of numbers.\n");
        System.out.print("Enter any number: ");
        value = input.nextInt();
        input.close();
        for(i=0; i<=value; i++){
            sum = sum +i;
        }
        System.out.printf("1 + 2 + 3 + ...... + %d = %d\n",value,sum);
    }
}
