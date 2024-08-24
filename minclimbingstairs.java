import java.util.Scanner;

public class minclimbingstairs66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of stairs
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Maximum jumps allowed from each stair
        }

        int ans = minMoves(n, arr);
        System.out.println(ans);
    }

    public static int minMoves(int n, int[] arr) {
        int[] dp = new int[n + 1];
        dp[n] = 0; // No moves needed when already at the top

        // Fill the dp array from right to left
        for (int i = n - 1; i >= 0; i--) {
            int steps = arr[i];
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= steps && i + j <= n; j++) {
                if (dp[i + j] != Integer.MAX_VALUE) {
                    min = Math.min(min, dp[i + j]);
                }
            }
            dp[i] = min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min + 1;
        }

        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0];
    }
}