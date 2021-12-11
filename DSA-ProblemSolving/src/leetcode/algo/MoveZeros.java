package leetcode.algo;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String arg) {

	}

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
