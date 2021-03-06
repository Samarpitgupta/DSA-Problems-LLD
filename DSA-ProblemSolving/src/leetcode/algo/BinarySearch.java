package leetcode.algo;

public class BinarySearch {

	public static void main(String[] args) {

	}
	
	 public static int search(int[] nums, int target) {
	        int n=nums.length;
	        int start=0,end=n-1;
	        
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;
	            if(nums[mid]==target)
	                return mid;
	            
	            if(nums[mid]<target)
	                start=mid+1;
	            else
	                end=mid-1;
	        }
	        
	        return -1;
	    }

}
