package arrays.advanced;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 8, 12 };
		System.out.println(maxProfit(arr, 0, arr.length - 1));
		System.out.println(maxProfit(arr));
	}

	// Naive
	// recursion
	public static int maxProfit(int price[], int start, int end) {
		if (start >= end)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				// taking only pair when sell is greater than buy (end>start)
				if (price[j] > price[i]) {
					int currProfit = price[j] - price[i] + maxProfit(price, start, i - 1)
							+ maxProfit(price, j + 1, end);
					profit = Integer.max(profit, currProfit);
				}
			}
		}
		return profit;
	}

	// efficient solution
	public static int maxProfit(int price[]) {
		int profit = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] > price[i - 1]) {
				profit += price[i] - price[i - 1];
			}
		}
		return profit;
	}
}
