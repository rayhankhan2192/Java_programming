//70. Climbing Stairs, how many ways you can climb a stairs
package mainjava;

public class Problem_16_leet_70 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(result(n));
    }

    public static int result(int n) {
        int[] dp = new int[n + 1];
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        } else {
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}
