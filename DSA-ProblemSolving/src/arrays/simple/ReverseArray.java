package arrays.simple;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String args[]) {
		int arr[] = { 4, 2, 66, 12, 53, 63, 777, 11, 111 };
		int arr2[] = { 4, 5, 10, 12, 13, 43, 777, 1111, 1112 };
		System.out.println(Arrays.toString(reverse(arr)));
		System.out.println(Arrays.toString(reverse(arr2)));
	}

	public static int[] reverse(int[] arr) {
		int n = arr.length;
		int low = 0, high = n - 1;
		while (low < high) {
			int temp;
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		return arr;
	}
}
