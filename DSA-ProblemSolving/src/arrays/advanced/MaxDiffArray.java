package arrays.advanced;

public class MaxDiffArray {

	public static void main(String args[]) {
		int a[] = { 2, 4, 6, 7, 8, 8, 9, 9, 9, 10 };
		System.out.println(maxDiffArray(a));
		System.out.println(maxDiffArr(a));
	}

	// naive approach - theta(n2) - time
	// Maximum Difference problem is to find the maximum of arr[j] - arr[i] where
	// j>i.F
	public static int maxDiffArray(int[] arr) {
		int res = arr[1] - arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				res = Integer.max(res, arr[j] - arr[i]);
			}
		}
		return res;
	}

	// efficient solution
	// keeping track of minVal
	// theta(n)
	public static int maxDiffArr(int arr[]) {
		int res = arr[1] - arr[0], minVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = Integer.max(res, arr[i] - minVal);
			minVal = Integer.min(arr[i], minVal);
		}
		return res;
	}

}
