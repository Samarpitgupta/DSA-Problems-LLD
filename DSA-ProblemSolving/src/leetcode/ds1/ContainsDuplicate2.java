package leetcode.ds1;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1, 2, 3 };
		System.out.println(containsNearbyDuplicate(nums, 2));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                return true;
            }
            map.put(nums[i], i); 
        }
        return false;

	}
}
