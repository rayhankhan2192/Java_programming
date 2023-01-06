//58. Length of Last Word
package mainjava;

public class Problem_12_leet_58 {
    public static void main(String[] args) {
        String s = ("Hello java World ");
        int i = 0;
        int value = 0;
        s = s.trim();
        for (i = s.lastIndexOf(" "); i < s.length() - 1; i++) {
            value++;
        }
        System.out.println(value);
        // System.out.println( s.trim().length()-s.trim().indexOf(" ")-1);
    }
}
