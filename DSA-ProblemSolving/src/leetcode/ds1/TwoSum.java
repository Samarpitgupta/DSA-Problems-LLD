package leetcode.ds1;

public class TwoSum {

	public static void main(String[] args) {
		
	}

	public int[] twoSum(int[] nums, int target) {
		int currSum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				currSum = nums[i] + nums[j];
				if (currSum == target)
					return new int[] { i, j };
				currSum = 0;
			}
		}
		return null;
	}

}
