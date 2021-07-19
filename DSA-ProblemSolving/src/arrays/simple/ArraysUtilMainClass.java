package arrays.simple;

import java.util.Arrays;

public class ArraysUtilMainClass {

	public static void main(String args[]) {
		int a[] = { 10, 12, 13, 14, 15 };
		int b[] = { 10, 12, 13, 14, 15 };
		int c[];
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a));
		System.out.println(Arrays.binarySearch(a, 13));
		Arrays.fill(a, 7);
		System.out.println(Arrays.toString(a));
		Arrays.fill(a, 1, 2, -1); // [from,to)
		System.out.println(Arrays.toString(a));

		// Multi-Dimension
		int[][] arr = new int[3][4];
		for (int[] row : arr) {
			Arrays.fill(row, -1);
			System.out.println(Arrays.toString(row));
		}
		
		// Binary Search
		System.out.println(Arrays.binarySearch(b, 15));
		System.out.println(Arrays.binarySearch(b, 16)); // return index if match

		// if not present return (insertion point + 1)negative with position where can be
		// element place
		// using which can get the closest values of the search element
	
		// Binary Search for non-primitive	
	
	}
	

}
