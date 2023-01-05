/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". */
package mainjava;

import java.util.Arrays;

public class Problem_6_leet {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println("\nReturn value is: "+longest_path(strs)); 

    }

    public static String longest_path(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        int i;
        System.out.println("\nSorted Array: ");
        for (i = 0; i < strs.length; i++)
            System.out.print(strs[i]+" ");
            System.out.println();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for ( i = 0; i < strs.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);
            }
            else{
                break;
            }
        }
        return i == 0 ? null : result.toString();
    }
}
/*int i=0;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(i < first.length()){
            if (first.charAt(i) == last.charAt(i)) {
                 i++;
            }
            else{
                 break;
            }           
        }
        return i == 0 ? "" : first.substring(0, c); */
