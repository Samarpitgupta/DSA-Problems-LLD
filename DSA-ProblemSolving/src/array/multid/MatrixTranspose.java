package array.multid;

public class MatrixTranspose {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9, 19, 20 }, { 10, 12, 14, 15, 16 }, { 17, 20, 21, 22, 23 },
				{ 31, 32, 42, 43, 44 } };
		arr = transposeMat(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int arr2[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9, 19, 20 }, { 10, 12, 14, 15, 16 }, { 17, 20, 21, 22, 23 },
				{ 31, 32, 42, 43, 44 } };
		arr2 = transposeMatrix(arr2, 5, 5);
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//
		int arr3[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9, 19, 20 }, { 10, 12, 14, 15, 16 }, { 17, 20, 21, 22, 23 },
				{ 31, 32, 42, 43, 44 } };
		int temp[][] = arr;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				temp[i][j] = arr3[j][i];
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = temp[i][j]; //
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

	// efficient
	// inline // one traversal
	public static int[][] transposeMat(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat[i].length; j++) {
				int temp;
				temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}

	public static int[][] transposeMatrix(int mat[][], int m, int n) {
		int temp[][] = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				temp[i][j] = mat[j][i];
			}
		}
		return temp;
	}
}
