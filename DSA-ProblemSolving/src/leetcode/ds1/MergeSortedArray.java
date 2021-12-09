package leetcode.ds1;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 4, 5 };
		int arr2[] = new int[] { 2, 4, 6, 7, 9, 12 };
		// o/p [1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 9, 12]
		System.out.println(Arrays.toString(merge(arr1, arr2)));

	}

	// not lc 88 problem
	public static int[] merge(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int arr[] = new int[m + n];
		int i = 0, j = 0, k = 0; // i for arr1, j for arr2, k for new arr

		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				arr[k] = nums1[i];
				i++;
				k++;
			} else {
				arr[k] = nums2[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			arr[k] = nums1[i];
			i++;
			k++;
		}
		while (j < n) {
			arr[k] = nums2[j];
			j++;
			k++;
		}
		return arr;
	}

	// lc 88 problem
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i  = m -1 ,j = n-1,index = nums1.length - 1;
        while(i != -1 || j!=-1){
            
            int firstArrayDigit = i!=-1?nums1[i]:Integer.MIN_VALUE;
            int secondArrayDigit = j!=-1?nums2[j]:Integer.MIN_VALUE;
            
            if(firstArrayDigit <= secondArrayDigit){
                nums1[index--] = secondArrayDigit;
                j--;
            }
            else{
                nums1[index--] = firstArrayDigit;
                i--;
            }
        }
    }
}
