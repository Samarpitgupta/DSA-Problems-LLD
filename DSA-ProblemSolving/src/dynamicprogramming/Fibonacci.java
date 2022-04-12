package dynamicprogramming;

public class Fibonacci {
	final int max = 10000;
	int[] dp = new int[max];

	public int fib(int n) {
		if (dp[n] != -1) {
			int result;
			if (n <= 1)
				result = n;
			else
				result = fib(n - 1) + fib(n - 2);
			dp[n] = result;
		}
		return dp[n];
	}
}
