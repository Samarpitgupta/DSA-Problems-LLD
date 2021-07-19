package arrays.advanced;

import java.util.Arrays;

public class LeftRotateByDArray {

	public static void main(String args[]) {
		int a[] = { 10, 12, 13, 14, 15 };
		int b[] = { 10, 12, 13, 14, 15 };
		System.out.println(Arrays.toString(leftRotateByD(a, 3)));
		System.out.println(Arrays.toString(leftRotateByDUsingTemp(b, 3)));
		System.out.println(Arrays.toString(leftRotateByDElement(b, 3)));
	}

	public static int[] leftRotateOne(int arr[]) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++)
			arr[i - 1] = arr[i];
		arr[arr.length - 1] = temp;
		return arr;
	}

	// Theta(n*d) time
	// theta(1) space
	public static int[] leftRotateByD(int arr[], int d) {
		for (int i = 0; i < d; i++)
			arr = leftRotateOne(arr);
		return arr;
	}

	// theta(d+n-d+d)---> theta(n+d)--> theta(n) time
	// theta(d)
	public static int[] leftRotateByDUsingTemp(int arr[], int d) {
		int temp[] = new int[d];
		for (int i = 0; i < d; i++)
			temp[i] = arr[i];
		for (int j = d; j < arr.length; j++)
			arr[j - d] = arr[j];
		for (int k = 0; k < d; k++)
			arr[arr.length - d + k] = temp[k];
		return arr;
	}

	// Best solution
	// time - theta(n)
	// space - theta(1)
	public static int[] leftRotateByDElement(int arr[], int d) {
		arr = reverse(arr, 0, d - 1);
		arr = reverse(arr, d, arr.length - 1);
		arr = reverse(arr, 0, arr.length - 1);
		return arr; // ans is wrong // check solution
	}

	public static int[] reverse(int[] arr, int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		return arr;
	}

}
