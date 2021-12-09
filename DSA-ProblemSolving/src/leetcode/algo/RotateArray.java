package leetcode.algo;

import java.util.Arrays;

public class RotateArray {

	public static void main(String args[]) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		rotate(nums, 2);
	}

	public static void rotate(int[] nums, int k) {

		k = k % nums.length;
		if (k < 0)
			k = k + nums.length;
		reverse(nums, 0, nums.length - k - 1);
		System.out.println(Arrays.toString(nums));
		reverse(nums, nums.length - k, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		reverse(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));


	}

	public static void reverse(int[] a, int i, int j) {
		int li = i;
		int ri = j;

		while (li < ri) {
			int temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;

			li++;
			ri--;
		}
	}
}
