package daily.dsa;

import java.util.HashMap;
import java.util.Map;

public class D1SubArraySumCount {

	public static void main(String[] args) {

	}

	public int subarraySum(int[] nums, int k) {
		int sum = 0, count = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum == k)
				count++;
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}
}
