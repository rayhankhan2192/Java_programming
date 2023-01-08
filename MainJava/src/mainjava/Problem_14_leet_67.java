//67. Add Binary
package mainjava;

import java.util.Scanner;

class Problem_14_leet_67 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int carry = 0;
        System.out.print("Enter Fist  value: ");
        String a = Input.nextLine();
        
        System.out.print("Enter second value: ");
        String b = Input.nextLine();
        Input.close();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += (a.charAt(i--) - '0');//substract by '0' to convert the number char to int
            }
            if (j >= 0) {
                sum += (b.charAt(j--) - '0');
            }
            System.out.println("Sum "+str);
            str.append(sum % 2);
            carry = sum / 2;
            //i--;
            //j--;
        }
        if (carry != 0) {
            str.append(carry);
        }
        System.out.println(str.reverse().toString());
    }
}