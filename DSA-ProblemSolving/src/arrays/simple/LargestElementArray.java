package arrays.simple;

public class LargestElementArray {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 66, 12, 53, 63, 777, 11, 111 };
		int arr2[] = { 111, 111 };
		System.out.println(largestElement(arr));
		System.out.println(largestEle(arr));
		System.out.println(largestElement(arr2));
		System.out.println(largestEle(arr2));
	}

	// O(n)
	public static int largestElement(int[] arr) {
		int largestElement = Integer.MIN_VALUE;
		if (arr.length == 0) {
			return -1;
		}
		for (int i : arr) {
			if (i > largestElement)
				largestElement = i;
		}

		return largestElement;

	}

	// naive approach
	// O(n^2)
	public static int largestEle(int[] arr) {
		if (arr.length == 0)
			return -1;
		int largestEle = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					largestEle = arr[j];
				}
			}
		}
		return largestEle;
	}
}
