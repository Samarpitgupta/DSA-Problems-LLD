package array.multid;

public class BoundryTraversal {

	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 4, 5, 6 }, { 7, 8, 9, 19, 20 }, { 10, 12, 14, 15, 16 }, { 17, 20, 21, 22, 23 },
				{ 31, 32, 42, 43, 44 } };
		boundryTraversal(arr);
	}

	// arr[r][c]
	public static void boundryTraversal(int arr[][]) {
		int r = arr.length;
		int c = 5;
		if (r == 1) {
			for (int i = 0; i < c; i++) {
				System.out.print(arr[0][i] + " ");
			}
		} else if (c == 1) {
			for (int i = 0; i < r; i++) {
				System.out.print(arr[i][0] + " ");
			}
		} else {
			for (int i = 0; i < c; i++)
				System.out.print(arr[0][i] + " ");
			for (int i = 1; i < r; i++)
				System.out.print(arr[i][c - 1] + " ");
			for (int i = c - 2; i >= 0; i--)
				System.out.print(arr[r - 1][i] + " ");
			for (int i = r - 2; i >= 1; i--)
				System.out.print(arr[i][0] + " ");
		}

	}
}
