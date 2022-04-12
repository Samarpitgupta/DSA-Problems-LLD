package dynamicprogramming;

public class HouseRobber {

	public static void main(String[] args) {

	}

	public int rob(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int[] dp = new int[num.length + 1];
		dp[0] = 0;
		dp[1] = num[0];
		for (int i = 2; i <= num.length; i++) {
			dp[i] = Math.max(dp[i - 1], num[i - 1] + dp[i - 2]);
		}
		return dp[num.length];
	}
}
