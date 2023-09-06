package learn.dynamicProgramming;


import java.util.Arrays;

public class MinimumCoinChange {
    public static int minCoinsToMakeChange(int[] coins, int amount) {
        // Initialize an array to store minimum coin counts for each amount from 0 to the target amount.
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize to a large value.
        dp[0] = 0; // Base case: 0 coins needed to make change for 0.

        // Iterate through coin denominations and calculate minimum coin counts.
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] is still Integer.MAX_VALUE, it means it's not possible to make exact change.
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20}; // Coin denominations
        int amount = 20; // Target amount
        int result = minCoinsToMakeChange(coins, amount);

        if (result != -1) {
            System.out.println("Minimum coins needed to make change for " + amount + ": " + result);
        } else {
            System.out.println("It's not possible to make exact change for " + amount);
        }
    }
}