package mainjava;

import java.util.HashMap;

public class Problem_5 {
    public static void main(String[] args) {
        String input = "III";
        String input_1 = "MCMXCIV";
        romanToInt(input);
        System.out.println("Roman "+input+" to Integer is "+romanToInt(input));
        System.out.println("\nRoman "+input_1+" to Integer is "+romanToInt(input_1));
        System.out.println();

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);

        int result = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (i > 0 && value.get(s.charAt(i)) > value.get(s.charAt(i-1))) {
                result += value.get(s.charAt(i)) - 2*value.get(s.charAt(i-1));
            }else{
                result += value.get(s.charAt(i));
            }
        }
        return result;
    }
}
