class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k<0) {
            k += nums.length;
        }
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

        public static void reverse(int nums[], int li, int ri){       
            while(li < ri){
                int temp = nums[li];
                nums[li] = nums[ri];
                nums[ri] = temp;
                
                li++;
                ri--;
            }
    }
}