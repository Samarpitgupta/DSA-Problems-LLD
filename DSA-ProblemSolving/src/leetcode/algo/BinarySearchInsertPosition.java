package leetcode.algo;

public class BinarySearchInsertPosition {

	public static void main(String[] args) {

	}

	public static int searchInsert(int[] nums, int target) {
		if (target > nums[nums.length - 1])  // edge case
			return nums.length;
		if (target < nums[0]) // edge case
			return 0;
		int i = 0;
		while (nums[i] < target && i < nums.length) {
			i++;
		}
		return i;
	}

}
