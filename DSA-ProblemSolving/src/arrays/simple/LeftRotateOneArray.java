package arrays.simple;

import java.util.Arrays;

public class LeftRotateOneArray {

	public static void main(String[] args) {
		int a[] = { 1, 5, 1, 5, 2, 5, 16 };
		System.out.println(Arrays.toString(leftRotateByOne(a)));
	}

	public static int[] leftRotateByOne(int[] arr) {
		int temp;
		temp = arr[0];

		for (int i = 1; i < arr.length; i++)
			arr[i - 1] = arr[i];
		arr[arr.length - 1] = temp;
		return arr;
	}

}
