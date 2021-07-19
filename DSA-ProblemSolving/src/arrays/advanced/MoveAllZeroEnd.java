package arrays.advanced;

import java.util.Arrays;

public class MoveAllZeroEnd {
	public static void main(String args[]) {
		int a[] = { 0, 10, 0, 12, 0, 13, 14, 15, 17, 0 };
		System.out.println(Arrays.toString(moveAllZeroEnd(a)));
		moveAllZeroToEnd(a);
	}

	public static int[] moveAllZeroEnd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr; // ans in not coming correct // needs to do dry run and fix
	}

	// efficient solution
	public static void moveAllZeroToEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.print(Arrays.toString(arr));// ans in not coming correct // needs to do dry run and fix
	}

}
