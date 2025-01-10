class Solution {
    public int search(int[] nums, int target) {
        int arrLen=nums.length;
        if(arrLen==0)
            return -1;
        if(arrLen==1)
        {
            if(target==nums[0])
                return 0;
            else
                return -1;
        }
        int start=0, end=arrLen-1;
        int mid=(start+end)/2;
        int low=0, high=arrLen,f=0;
        if(nums[mid]>nums[end])
            high=mid;
        else
            low=mid+1;
        while(low<high)
        {
            int m=(low+high)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m]>target)
                high= m-1;
            else
                low=m+1;
        }
        while(f<nums.length)
        {
            if(nums[f]==target)
                return f;
            ++f;
        }
        return -1;
    }
}