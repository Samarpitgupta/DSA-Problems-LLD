package array.multid;

public class MultiDArray {

	public static void main(String[] args) {

		// first(outer) brac - number of array objects
		// second(inner) brac - number of elements in each array
		int arr[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9 } };
		int arr1[][] = new int[3][4]; // valid
		int m = 4, n = 4;
		int arr2[][] = new int[m][n]; // valid
		int arr3[][] = new int[m][]; // valid --> Jagged Array
		// int arr3[][] = new int[][n]; //invalid
		// int arr[3][5];//invalid
		// int arr[][5];//invalid
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j] + " ");
			}
		}

		print(arr);
	}

	public static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
		}
	}

}
