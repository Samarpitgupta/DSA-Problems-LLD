package sorting.cyclic;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String args[]) {
		int[] nums = { 3, 5, 6, 4, 2, 1 };
		System.out.println(Arrays.toString(cyclicSort(nums)));
	}

	public static int[] cyclicSort(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct])
				swap(nums, i, correct);
			else
				i++;
		}
		return nums;
	}

	public static int[] swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		return nums;
	}

}
