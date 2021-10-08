package arrays.advanced;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {

	}

	int maxLen(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (sum == 0)
				max = i + 1;
			else {
				if (map.get(sum) != null)
					max = Math.max(max, i - map.get(sum));
				else
					map.put(sum, i);
			}
		}
		return max;
	}
}
