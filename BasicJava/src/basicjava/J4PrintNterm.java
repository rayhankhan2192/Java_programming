package basicjava;

import java.util.Scanner;

public class J4PrintNterm {
    public static void main(String[] srgs) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter any number: ");
        number = in.nextInt();
        in.close();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d ",i);
        }
        System.out.print("\n");
    }
}
