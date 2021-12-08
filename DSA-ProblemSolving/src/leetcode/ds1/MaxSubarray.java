package leetcode.ds1;

public class MaxSubarray {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1, 2, 3 };
		System.out.println(maxSubArray(nums));
	}

	// A subarray is a contiguous part of an array.
	public static int maxSubArray(int[] nums) {
        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(sum, max);
            if(sum<0)
                sum=0;
        }
        return max;
        
    }
}
