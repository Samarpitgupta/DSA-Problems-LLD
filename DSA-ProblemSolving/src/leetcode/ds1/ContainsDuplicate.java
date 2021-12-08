package leetcode.ds1;

import java.util.Arrays;

public final class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] { 1,2,3,1 };
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
    }

}
