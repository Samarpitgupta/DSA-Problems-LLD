package arrays.simple;

public class IsArraySorted {

	public static void main(String args[]) {
		int arr[] = { 4, 2, 66, 12, 53, 63, 777, 11, 111 };
		int arr2[] = { 4, 5, 10, 12, 13, 43, 777, 1111, 1112 };
		System.out.println(isArraySorted(arr));
		System.out.println(isArraySorted(arr2));
		System.out.println(isArraySortedNaive(arr));
		System.out.println(isArraySortedNaive(arr2));
	}

	// considering only increasing order
	public static boolean isArraySorted(int arr[]) {
		if (arr.length == 0)
			return false;
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < arr[i - 1])
				return false;
//		int largeEle = arr[0];
//		for (int i : arr) {
//			if (largeEle > i)
//				return false;
//		}
		return true;
	}

	// considering only increasing order
	// Naive
	// O(n^2)
	public static boolean isArraySortedNaive(int arr[]) {
		if (arr.length == 0)
			return false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
