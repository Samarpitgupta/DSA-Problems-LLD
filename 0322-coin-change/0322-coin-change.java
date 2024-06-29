class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1); // Initialize dp array with a value greater than the maximum amount
        minCoins[0] = 0; // Base case: no coins needed to make amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                minCoins[i] = Math.min(minCoins[i], minCoins[i - coin] + 1);
            }
        }

        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }
}