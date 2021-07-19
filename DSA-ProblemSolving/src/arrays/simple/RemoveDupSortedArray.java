package arrays.simple;

public class RemoveDupSortedArray {

	public static void main(String[] args) {
		int a[] = { 10, 10, 12, 13, 13, 14, 15, 15 };
		int b[] = { 10, 20, 20, 30, 30, 30 };
		System.out.println(removeDupSortedArr(a));
		System.out.println(removeDupSortedArray(a));
		System.out.println(removeDupSortedArr(b));
		System.out.println(removeDupSortedArray(b));

	}

	// Naive Approach
	// extra space
	public static int removeDupSortedArr(int[] arr) {
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;

		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = temp[i];
		return res;
	}

	// 10, 10, 12, 13, 13, 14, 15, 15
	// O(n) time
	// O(1) space
	public static int removeDupSortedArray(int arr[]) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res; // need to check correct output // solution might wrong
	}

}
