package mainjava;

import java.util.Scanner;
import java.util.Stack;

public class Problem_7_leet_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Input [ Input() ]: ");
        String c = s.nextLine();
        System.out.println(Valid_Parentheses(c));
        s.close();
    }

    public static boolean Valid_Parentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
